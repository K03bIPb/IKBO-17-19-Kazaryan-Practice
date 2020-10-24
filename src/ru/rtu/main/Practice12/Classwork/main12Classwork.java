package ru.rtu.main.Practice12.Classwork;

import java.util.*;

public class main12Classwork {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(); //сортирует элементы по размеру или алфавиту
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();  //запись элементов в порядке добавления
        HashMap<String, Integer> good2count = new HashMap<>(); //два элемента - ключ и значение
        Scanner scanner = new Scanner(System.in);

        for (; ;) {
            String a = scanner.nextLine();
            if (a.equals("LIST"))
            {
                printMap(good2count);
                continue;
            }
            int count = 1;

            if (good2count.containsKey(a))
                count += good2count.get(a);

            good2count.put(a, count);

        }
    }
    private static void printMap(Map<String, Integer> map){
        for (String key: map.keySet()){
            System.out.println(key + " = " + map.get(key));
        }
    }
}
