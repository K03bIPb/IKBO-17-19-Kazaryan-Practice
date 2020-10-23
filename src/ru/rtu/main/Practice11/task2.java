package ru.rtu.main.Practice11;

import java.util.Scanner;


public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] input = a.split(" ");
        boolean numericalCheck = true;
        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < input[j].length(); i++) {
                if (!Character.isLetter(input[j].charAt(i))){
                     numericalCheck = false;
                }
            }
        }

        if ((input.length == 2) && (numericalCheck)){
            System.out.println("Фамилия: " + input[0] + "\n" + "Имя: " + input[1]);
        }
        else if ((input.length == 3) && (numericalCheck)){
            System.out.println("Фамилия: " + input[0] + "\n" + "Имя: " + input[1] + "\n" + "Отчество: " + input[2]);
        }
        else System.out.println("Введенная строка не является ФИО либо имеет некорректный формат");
    }


}
