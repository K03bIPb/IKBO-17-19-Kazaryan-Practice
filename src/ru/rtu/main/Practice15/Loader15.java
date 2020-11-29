package ru.rtu.main.Practice15;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Loader15 {
    public static void main(String[] args) {
        parseHTML();
    }
    public static void loggingThings(){
        try{
            parseHTML();
        }catch (Exception exception){

        }
    }
    public static void parseTable(){
        try{
            List<String> lines = Files.readAllLines(Paths.get("src/ru/rtu/main/Practice14/Data/table.csv"));
            String[] line = lines.get(0).split(";");
            for (String l:line){
                System.out.println(l);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void parseHTML(){
        try{
            Document html = Jsoup.connect("https://yandex.ru/").get();
            Elements news = html.select("span.news__item-content");
            for(Element item: news){
                System.out.println(item.text());
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}