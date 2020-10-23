package ru.rtu.main.Practice11;

public class task1 {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] res = text.split(" ");
        int[] nums = new int[3];
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
