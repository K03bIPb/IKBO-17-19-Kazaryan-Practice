package ru.rtu.main.Practice14.Task1;

import java.io.File;
import java.io.PrintWriter;

public class Task1 {
    public static void main(String[] args) {
        File logfile = new File("src/ru/rtu/main/Practice14/Data/log.txt");
        try {
            if (!logfile.createNewFile()){
                log("logfile is already created");
                System.out.println("logfile is already created");
            }
            else {
                log("logfile created successfully");
                System.out.println("logfile created successfully");
            }
        }
        catch(Exception ex){
            log(ex.getMessage());
            System.out.println("exception createnewfile happened");
        }
    }
    public static void log(String log_message) {
        try {
            PrintWriter writer = new PrintWriter("src/ru/rtu/main/Practice14/Data/log.txt");
            writer.write(log_message);
            writer.flush();
            writer.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("printStackTrace exception");
        }
    }
}
