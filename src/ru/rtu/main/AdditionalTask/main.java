package ru.rtu.main.AdditionalTask;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int res = 0;
        if (checkN(N)) {
            for(int z=0;z<=1+N/2;++z) {
                res += 1 + (100000 - z * 5) / 2;
                System.out.println(res + "\n");
            }
        }
        System.out.println(res + "\n");
        }


    public static boolean checkN ( int N){
        if ((N < 1) || (N > 10_000)) {
            System.out.println("Incorrect N!");
            return false;
        } else return true;
    }
}
