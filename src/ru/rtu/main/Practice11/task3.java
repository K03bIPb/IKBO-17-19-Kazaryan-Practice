package ru.rtu.main.Practice11;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        a = a.replaceAll("-", "");
        a = a.replaceAll("\\+", "");
        a = a.replaceAll("\\)", "");
        a = a.replaceAll("\\(", "");
        a = a.replaceAll(" ", "");
        char[] arr = a.toCharArray();
        boolean format1 = false;
        boolean format2 = false;
        if (((arr[0] == '7') || (arr[0] == '8')) && (a.length() == 11)){
            format1 = true;
        }
        else if ((arr[0] == '9')  && (a.length() == 10)){
            format2 = true;
        }
        else System.out.println("Неверный формат номера!");

        if (format1){
            System.out.println("+" + " " + 7 + " " + "(" + arr[1] + arr[2]+ arr[3] + ")" + " " + arr[4] + arr[5] + arr[6] + "-" + arr[7] + arr[8] + "-" + arr[9] + arr[10]);
        }
        if (format2){
            System.out.println("+" + " " + 7 + " " + "(" + arr[0] + arr[1]+ arr[2] + ")" + " " + arr[3] + arr[4] + arr[5] + "-" + arr[6] + arr[7] + "-" + arr[8] + arr[9]);
        }
    }
}
