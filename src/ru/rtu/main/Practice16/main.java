package ru.rtu.main.Practice16;

import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println(parseJson());
        Gson json = new Gson();
        Person person = json.fromJson(parseJson(), Person.class);
        System.out.println(person.firstName + " " + person.surname + " " + person.age);
        System.out.println(person.address.city + " " + person.address.street);
        person.phoneNumbers.forEach(phone -> System.out.println(phone.number + " " + phone.type));
    }
    public static String parseJson(){
        StringBuilder builder = new StringBuilder();
        try{
            List<String> files = Files.readAllLines(Paths.get("src/ru/rtu/main/Practice16/Data/test.json"));
            files.forEach(file -> builder.append(file).append("\n"));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return builder.toString();
    }
}

class Person{
    public String firstName;
    public String surname;
    public int age;
    public Address address;
    public List<String> test = new ArrayList<>();
    public List<Phone> phoneNumbers;
}

class Address{
    public String city;
    public String street;
}

class Phone{
    public String type;
    public String number;
}