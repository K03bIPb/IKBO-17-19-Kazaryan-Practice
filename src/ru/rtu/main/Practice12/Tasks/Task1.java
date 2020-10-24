package ru.rtu.main.Practice12.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            if (split[0].equals("ADD")) {
                try {
                    int a = Integer.parseInt(split[1]);
                    String task = "";
                    for (int i = 2; i < split.length; i++) {
                        task = task + " " + split[i];
                    }
                    list.add(a, task);
                } catch (NumberFormatException exception) {
                    String task = "";
                    for (int i = 1; i < split.length; i++) {
                        task = task + " " + split[i];
                    }
                    list.add(task);
                }
            }
            if (split[0].equals("DELETE")) {
                try {
                    int b = Integer.parseInt(split[1]);
                    try {
                        list.remove(b);
                    } catch (IndexOutOfBoundsException exception) {
                        System.out.println("Wrong index: out of bounds");
                    }
                } catch (NumberFormatException exception) {
                    System.out.println("Wrong format to delete!");
                }
            }
            if (split[0].equals("EDIT")) {
                try {
                    int c = Integer.parseInt(split[1]);
                    String task = "";
                    for (int i = 2; i < split.length; i++) {
                        task = task + " " + split[i];
                    }
                    list.set(c, task);
                } catch (NumberFormatException exception) {
                    System.out.println("W");
                }

            }
            if (input.equals("STOP")){
                break;
            }
            if (split[0].equals("LIST")) {
                for (String item : list) {
                    System.out.println("Дело " + item + " под номером " + list.indexOf(item));
                }
            }
        }
    }
}
