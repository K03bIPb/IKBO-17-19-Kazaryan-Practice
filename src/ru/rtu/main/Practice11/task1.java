package ru.rtu.main.Practice11;

public class task1 {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] res = new String[2];

        int textIndex = text.indexOf(' ', text.indexOf(' ') + 1) + 1;
        res[0] = text.substring(textIndex, text.indexOf(' ', textIndex));
        int textLastIndex = text.lastIndexOf(' ', text.lastIndexOf(' ')-1) + 1;
        res[1] = text.substring(textLastIndex, text.indexOf(' ', textLastIndex));
        int result = Integer.parseInt(res[0]) + Integer.parseInt(res[1]);
        System.out.println("Result: " + result);
    }
}
