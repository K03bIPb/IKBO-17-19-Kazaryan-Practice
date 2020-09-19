package ru.rtu.main.Practice1;
import java.util.Random;

public class main1 {
    //task 1
    static int all_cycles() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;

        do {
            sum = sum + array[i];
            i++;
        }
        while (i < array.length);
        System.out.println(sum);

        return 0;
    }
    static void harmonic(){
        System.out.println(1);
        for(int i=2;i<11;i++)
            System.out.println(1 + "/"+i);
    }
    static void rand() {
        Random random = new Random();
        int[] mas = new int[random.nextInt(100) + 10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100) + 10;
        }
        for (int i = 0; i < mas.length; i++)
            System.out.println(mas[i]);
    }
    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i < n+1; i++) {
            res = res * i;
        }
        return res;

    }
    public static void main(String[] args) { //args homework
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

    }
}
