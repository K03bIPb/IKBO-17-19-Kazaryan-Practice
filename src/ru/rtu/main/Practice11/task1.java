package ru.rtu.main.Practice11;

public class task1 {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] res = new String[text.length()];
        for (int i = 0; i < res.length; i++) {
            int textIndex = text.indexOf(' ', text.indexOf(' ') + 1) + 1;
            res[i] = text.substring(textIndex, ' ');
            System.out.println(res[i]);
        }


        int[] nums = new int[100];
        int a = 0, b = 0, x = 0;
        for (int i = 0; i < res.length; i++) {
            try {
                nums[x] = Integer.parseInt(res[i]);
                x++;
            } catch (NumberFormatException ignored) {}
        }
        int result = nums[0] + nums[2];
        System.out.println("Result: " + result);
    }
}
