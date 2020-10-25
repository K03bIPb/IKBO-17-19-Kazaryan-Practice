package ru.rtu.main.Practice12.Tasks;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, String> contactsHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            if (split.length == 1) {
                boolean isAlreadyExists = false;
                if (input.equals("EXIT")) {
                    break;
                }
                if (input.equals("LIST")) {
                    printHashMapAlphabetical(contactsHashMap);
                } else {
                    if (isNumberFormatCorrect(input)) {
                        if (contactsHashMap.containsValue(numberFormat(input))) {
                           printSpecifiedKey(numberFormat(input), contactsHashMap);
                            isAlreadyExists = true;
                        }
                    } else if (isNameFormatCorrect(input)) {
                        if (contactsHashMap.containsKey(input)) {
                            printSpecifiedValue(input, contactsHashMap);
                            isAlreadyExists = true;
                        } else System.out.println("Не содержится в списке контактов. Создние нового контакта:");
                    } else System.out.println("Неверный формат ввода");

                    if (!isAlreadyExists) {
                        if (isNumberFormatCorrect(input)) {
                            while (true) {
                                System.out.println("Введите имя, чтобы создать новый контакт:");
                                String name = scanner.nextLine();
                                if (isNameFormatCorrect(name)) {
                                    contactsHashMap.put(name, numberFormat(input));
                                    System.out.println("Контакт добавлен!");
                                    break;
                                } else System.out.println("Неправильный формат имени! Попробуйте ещё раз");
                            }
                        } else {
                            if (isNameFormatCorrect(input)) {
                                while (true) {
                                    System.out.println("Введите номер телефона, чтобы создать новый контакт:");
                                    String number = scanner.nextLine();
                                    if (isNumberFormatCorrect(number)) {
                                        contactsHashMap.put(input, numberFormat(number));
                                        System.out.println("Контакт добавлен!");
                                        break;
                                    } else System.out.println("Неправильный формат телефона! попробуйте ещё раз!");
                                }
                            } else System.out.println("Это не имя и не номер телефона либо их формат некорректен!");
                        }
                    }
                }
            } else System.out.println("Недопустим ввод больше одного аргумента в строке!");
        }
    }


    private static void printSpecifiedValue(String key, Map<String, String> map) {
        System.out.println("Имя: " + key + ", телефон: " + map.get(key));
    }

    private static void printSpecifiedKey(String value, Map<String, String> map) {
        for (String key : map.keySet()) {
            if (value.equals(map.get(key))) System.out.println("Имя: " + key + ", телефон: " + map.get(key));
        }
    }

    public static boolean isNameFormatCorrect(String input) {
        char[] everySymbol = input.toCharArray();
        boolean check = true;
        for (char i : everySymbol) if (!Character.isAlphabetic(i)) check = false;
        return check;
    }

    public static boolean isNumberFormatCorrect(String input) {
        input = input.replaceAll("-", "");
        input = input.replaceAll("\\+", "");
        input = input.replaceAll("\\)", "");
        input = input.replaceAll("\\(", "");
        input = input.replaceAll(" ", "");
        char[] arr = input.toCharArray();
        boolean format1 = false;
        boolean format2 = false;
        try {
            Long.parseLong(input);
            if (((arr[0] == '7') || (arr[0] == '8')) && (input.length() == 11))
                format1 = true;
            else if ((arr[0] == '9') && (input.length() == 10))
                format2 = true;
            return format1 || format2;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
    public static void printHashMapAlphabetical(HashMap<String, String> hashMap){
        ArrayList<String> phoneNumbers = new ArrayList<>();
        TreeSet<String> sortTree = new TreeSet<>(hashMap.keySet());
        TreeSet<String> sortTreeCopy = new TreeSet<>(hashMap.keySet());
        for(int i = 0; i < hashMap.values().size();i++){
            phoneNumbers.add(null);
        }
        int f = 0;
        while(f < hashMap.size()) {
            for (String toPrint : hashMap.keySet()) {
                if (toPrint.equals(sortTree.first())) {
                    phoneNumbers.set(f, hashMap.get(toPrint));
                    System.out.println("replaced" + phoneNumbers.get(f));
                    f++;
                    sortTree.remove(sortTree.first());
                    break;
                }
            }
        }
        int l = sortTreeCopy.size();
        for (int i = 0; i < l; i++) {
            System.out.println("Имя: " + sortTreeCopy.first() +", телефон: " + phoneNumbers.get(i));
            sortTreeCopy.remove(sortTreeCopy.first());
        }

    }
    public static String numberFormat(String input) {
        input = input.replaceAll("-", "");
        input = input.replaceAll("\\+", "");
        input = input.replaceAll("\\)", "");
        input = input.replaceAll("\\(", "");
        input = input.replaceAll(" ", "");
        char[] arr = input.toCharArray();
        boolean format;
        if (((arr[0] == '7') || (arr[0] == '8')) && (input.length() == 11)) {
            format = true;
        }
        else if ((arr[0] == '9') && (input.length() == 10)) {
            format = false;
        }
        else return "Неверный формат номера!";

        if (format) {
            return ("+" + " " + 7 + " " + "(" + arr[1] + arr[2] + arr[3] + ")" + " " + arr[4] + arr[5] + arr[6] + "-" + arr[7] + arr[8] + "-" + arr[9] + arr[10]);
        }
        else return ("+" + " " + 7 + " " + "(" + arr[0] + arr[1] + arr[2] + ")" + " " + arr[3] + arr[4] + arr[5] + "-" + arr[6] + arr[7] + "-" + arr[8] + arr[9]);
    }
}
