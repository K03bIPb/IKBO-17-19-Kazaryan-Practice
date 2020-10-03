package ru.rtu.main.AdditionalTask;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (checkN(N)) {
            int ways = 0;
            int Ncopy = N;
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {
                    int coin1issued = 0;
                    int coin3issued = 0;
                    int coin5issued = 0;
                    while (Ncopy > 5) {
                        Ncopy =- 5;
                        coin5issued++;
                    }
                    while (Ncopy > 3) {
                        Ncopy =- 3;
                        coin3issued++;
                    }
                    while (Ncopy > 1) {
                        Ncopy =- 1;
                        coin1issued++;
                    }
                    if (Ncopy == 0) ways++;
                }

            }
        }
    }
    public static boolean checkN ( int N){
        if ((N < 1) || (N > 10_000)) {
            System.out.println("Incorrect N!");
            return false;
        } else return true;
    }
}
