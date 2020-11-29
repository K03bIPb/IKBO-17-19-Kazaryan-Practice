package ru.rtu.main.Practice14.Task3;
import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.util.Scanner;

import static ru.rtu.main.Practice14.Task1.Task1.log;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        try {
            System.out.println("Select file path to copy");
            String from = scanner.nextLine();
            File f = new File(from);
            File[] fileList = f.listFiles();
            String to = scanner.nextLine();
            assert fileList != null;
            try {
                for (File file : fileList) {
                    Files.copy(file.toPath(), new File(to + File.separator + file.getName()).toPath());
                }
            }catch(FileAlreadyExistsException ex){
                System.out.println("files already copied");
                check = false;

            }
            if (check) {
                log("Task 3: Copied from (" + from + ") to (" + to + ")");
                System.out.println("Task 3: Copied from (" + from + ") to (" + to + ")");
            }
        }catch(Exception ex){
            System.out.println("Incorrect filepath or this folder (folders) does (do) not exist");
        }
    }
}
