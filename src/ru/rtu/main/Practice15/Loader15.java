package ru.rtu.main.Practice15;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Loader15 {

    public static void main(String[] args) {
        parseTable();
    }

    public static void parseTable() {
        try {

            List<String> lines = Files.readAllLines(Paths.get("src/movementList.csv"));
            HashSet<String> companiesNames = new HashSet<>(getCompanyNames(lines));
            ArrayList<Company> companies = new ArrayList<>();
            for (String compName:companiesNames) {
                companies.add(new Company(compName));
            }
            for (String line:lines.subList(1, lines.size())){
                String str = line.split(",")[5];
                for (Company company : companies) {
                    if (formatString(str).contains(company.companyName)) {
                        company.addIncome(calcCompanyIncome(line));
                        company.addOutcome(calcCompanyOutcome(line));
                    }
                }
            }
            for (Company company:companies) {
                System.out.println(company);
            }
            calcFullInOutcome(lines);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static double deleteShittySymbols(String stringToParse) {  // у некоторых показателей "доходов" и "расходов" вместе с числами были символы """", неясно почему.
        String normal = "";
        for (Character l : stringToParse.toCharArray()) {
            if (Character.isDigit(l) || (String.valueOf(l).equals(".")))
                normal = normal + l;
        }
        try {
            return Double.parseDouble(normal);
        }catch (Exception ex){
            System.out.println("Shitty func is not working :(");
            return 0;
        }
    }


    public static String formatString(String string){
        String tempStrClear = "";
        for (Character chr : string.toCharArray()) {
            if (chr != ' ') {
                tempStrClear = tempStrClear + chr;
            }
        }
        String result = "";
        boolean startCheck = false;
        boolean endCheck = false;
        for (Character chr : tempStrClear.toCharArray()) {
            if (startCheck) {
                result = result + chr;
            }
            if ((chr == '/') || (chr == '\\')) {
                startCheck = true;
            }
            if ((chr == '.')) {
                endCheck = true;
            }
            if (startCheck && endCheck) {
                int toReplaceStart = result.indexOf(".") - 2;
                int toReplaceEnd = result.indexOf(".");
                String str = result.substring(toReplaceStart, toReplaceEnd);
                result = result.replace(str, "");
                result = result.replace(".", "");
                result = result.replaceAll("/", "");
                result = result.replaceAll("\\\\", "");
                result = result.replaceAll("_", "");
                result = result.replaceAll(">", "");
                endCheck = false;
                startCheck = false;
            }
        }
        return result;
    }
    public static double calcCompanyIncome(String clearStr){
        return deleteShittySymbols(clearStr.split(",")[6]);
    }
    public static double calcCompanyOutcome(String clearStr){
        return deleteShittySymbols(clearStr.split(",")[7]);
    }

    public static void calcFullInOutcome(List<String> lines){
        double sumIncome = 0;
        double sumOutcome = 0;
        for (String line:lines.subList(1, lines.size())) {
            double tempInc = deleteShittySymbols(line.split(",")[6]);
            sumIncome = sumIncome + tempInc;
            double tempOutcome = deleteShittySymbols(line.split(",")[7]);
            sumOutcome = sumOutcome + tempOutcome;
        }
        System.out.println("Сумма доходов: " + sumIncome + " руб" );
        System.out.println("Сумма расходов: " + sumOutcome + " руб" );
    }
    public static HashSet<String> getCompanyNames(List<String> lines){
        HashSet<String> companiesNames = new HashSet<>();
        for (String string:lines.subList(1,lines.size())) {
            String tempStr = string.split(",")[5];
            boolean startCheck = false;
            boolean endCheck = false;
            String tempStrClear = "";
            for (Character chr : tempStr.toCharArray()) {
                if (chr != ' ') {
                    tempStrClear = tempStrClear + chr;
                }
            }
            String company = "";
            for (Character chr : tempStrClear.toCharArray()) {
                if (startCheck) {
                    company = company + chr;
                }
                if ((chr == '/') || (chr == '\\')) {
                    startCheck = true;
                }
                if ((chr == '.')) {
                    endCheck = true;
                }
                if (startCheck && endCheck) {
                    int toReplaceStart = company.indexOf(".") - 2;
                    int toReplaceEnd = company.indexOf(".");
                    String str = company.substring(toReplaceStart, toReplaceEnd);
                    company = company.replace(str, "");
                    company = company.replace(".", "");
                    company = company.replaceAll("/", "");
                    company = company.replaceAll("\\\\", "");
                    company = company.replaceAll("_", "");
                    company = company.replaceAll(">", "");
                    companiesNames.add(company);
                    endCheck = false;
                    startCheck = false;
                    company = "";
                }
            }
        }
        return companiesNames;
    }


    public static void parseHTML() {
        try {
            Document html = Jsoup.connect("https://yandex.ru/").get();
            Elements news = html.select("span.news__item-content");
            for (Element item : news) {
                System.out.println(item.text());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void parse2() {
        try {
            String pathToCsv = "src/ru/rtu/main/Practice15/Data/movementList.csv";
            BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
            String row = csvReader.readLine();
            while (row != null) {
                String[] data = row.split(",");
                //data
                for (String s :
                        data) {
                    System.out.print(s + " ");
                }
                System.out.println();
                //data9
                row = csvReader.readLine();
            }
            csvReader.close();
        } catch (Exception ex) {
            System.out.println("something gone wrong :(");
        }
    }
}