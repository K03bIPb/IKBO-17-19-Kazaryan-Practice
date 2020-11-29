package ru.rtu.main.Practice14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Loader14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        File logfile = new File("src/ru/rtu/main/Practice14/Data/log.txt");
        log2("Is this gonna work?");
        log("and this?");
        try {
            if (logfile.createNewFile()){
                log2("logfile is already created");
            }
            else log2("logfile created successfully");
        }
        catch(Exception ex){
            log2(ex.getMessage());
        }

        try {
            Paths.get(input);
        } catch (Exception null_ex){
            log2(null_ex.getMessage());
        }

    }
    public static void log2(String log_message) {
        try {
            PrintWriter writer = new PrintWriter("src/ru/rtu/main/Practice14/Data/log.txt");
            writer.write(log_message);
            writer.flush();
            writer.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void log(String log_message) throws IOException {
        ArrayList<String> loglist = new ArrayList<>();
        loglist.add(log_message);
        Files.write(Paths.get("src/ru/rtu/main/Practice14/Data/log.txt"), loglist);
    }
}
