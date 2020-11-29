package ru.rtu.main.Practice14.Task2;

import java.io.File;
import java.util.Scanner;

import static ru.rtu.main.Practice14.Task1.Task1.log;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a path to file:");
        String input = scanner.nextLine();
        try {
            File file_to_work = new File(input);
            System.out.println("Размер папки " + file_to_work.getAbsolutePath() + " составляет " + getFolderSize(file_to_work) / (1024 * 1024) + " мегабайт");
        }catch(NullPointerException ex){
            System.out.println("Incorrect filepath or this folder does not exist");
            log("Task 2: Incorrect filepath or this folder does not exist");
        }
    }

    public static long getFolderSize(File folder) {
        long size = 0;
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                size += files[i].length();
            } else {
                size += getFolderSize(files[i]);
            }
        }
        return size;
    }
}
