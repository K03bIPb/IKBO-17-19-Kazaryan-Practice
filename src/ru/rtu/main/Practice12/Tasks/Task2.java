package ru.rtu.main.Practice12.Tasks;

import java.util.Scanner;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            if (split.length <= 2) {
                if (split[0].equals("LIST")) {
                    System.out.println(treeSet);
                }
                if (split[0].equals("ADD")) {
                    if (split[1].contains("@") && split[1].contains(".")) {
                        String[] split2 = split[1].split("@");
                        if ((split2[1].contains(".") && (split2[1].lastIndexOf(".") != split2[1].length()-1)))
                            treeSet.add(split[1]);
                        else System.out.println("Wrong e-mail format");
                    }
                    else System.out.println("Wrong e-mail format");
                }
                if (input.equals("STOP")){
                    break;
                }
            }
            else System.out.println("There can't be more than two arguments!");

        }
    }
}
