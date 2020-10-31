package ru.rtu.main.Practice13;

import java.util.*;

public class main13 {
    public static void main(String[] args) {
       ArrayList<String> carsNumbers = new ArrayList<>(generateCarNumbers());
        String isSearchSucceed = "";
        System.out.println("Print car number to search: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        long start = System.nanoTime();
        if (!carsNumbers.contains(input)) {
            isSearchSucceed = "Search was not successful!";
        }
        else isSearchSucceed = "Search was successful!";
        long end = System.nanoTime() - start; // метод нахождения времени на поиск
        System.out.println("Time to search using pure .contains method" + isSearchSucceed + ": " + end + " nanoseconds");
        isSearchSucceed = "";
        Collections.sort(carsNumbers); //без метода sort бинарный поиск в следующей строке работать не будет

        start = System.nanoTime();
        if (Collections.binarySearch(carsNumbers, input) == -1) {
            isSearchSucceed = "Search was not successful!";
        }
        else isSearchSucceed = "Search was successful!";
        end = System.nanoTime() - start;
        System.out.println("Time to search using binarySearch method" + isSearchSucceed + ": " + end + " nanoseconds");
        isSearchSucceed = "";
        HashSet<String> test = new HashSet<>(carsNumbers);

        start = System.nanoTime();
        if (!test.contains(input)) {
            isSearchSucceed = "Search was not successful!";
        }
        else isSearchSucceed = "Search was successful!";
        end = System.nanoTime() - start;
        System.out.println("Time to search using HashSet tables" + isSearchSucceed + ": " + end + " nanoseconds");
        isSearchSucceed = "";

        TreeSet<String> treeSet = new TreeSet<>(carsNumbers);
        start = System.nanoTime();
        if (!treeSet.contains(input)) {
            isSearchSucceed = "Search was not successful!";
        }
        else isSearchSucceed = "Search was successful!";
        end = System.nanoTime() - start;
        System.out.println("Time to search using TreeSet tables" + isSearchSucceed + ": " + end + " nanoseconds");
        isSearchSucceed = "";
    }
    public static ArrayList<String> generateCarNumbers(){
        ArrayList<String> carsNumbers = new ArrayList<>();
        String letters_str = "ABCEKMHOPCTYX"; //possible letters
        char[] letters = letters_str.toCharArray();
        String carNumberToAdd = "";
        int R = 199;
        for (int i = 0; i < R; i++) {
            for (int j = 1; j < 9; j++) {
                for (int let1 = 0; let1 < 13; let1++) {
                    for (int let2 = 0; let2 < 13; let2++) {
                        for (int let3 = 0; let3 < 13; let3++) {
                            carNumberToAdd = carNumberToAdd + letters[let1];
                            carNumberToAdd = carNumberToAdd + j;
                            carNumberToAdd = carNumberToAdd + j;
                            carNumberToAdd = carNumberToAdd + j;
                            carNumberToAdd = carNumberToAdd + letters[let2];
                            carNumberToAdd = carNumberToAdd + letters[let3];
                            carNumberToAdd = carNumberToAdd + i;
                            carsNumbers.add(carNumberToAdd);
                            carNumberToAdd = "";
                        }
                    }
                }
            }
        }
        return carsNumbers;

    }
}
/*
A666BC99
C888EK178
Возможны буквы ABCEKMHOPCTYX
N 1-9  - одинаковые три
R - (01 - 199) - регион

На ввод подается номер автомобиля, программа должна найти этот элемент прямым перебором,
затем бинармным поиском, затем через hashset и threeset

 */