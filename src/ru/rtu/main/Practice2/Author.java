package ru.rtu.main.Practice2;

public class Author {
    private String name;
    private String E_mail;
    private char gender;
    public Author(String name, String E_mail, char gender){
        this.name = name;
        this.E_mail = E_mail;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getE_mail(){
        return this.E_mail;
    }
    public void setE_mail(String E_mail){
        this.E_mail = E_mail;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", E_mail='" + E_mail + '\'' +
                ", gender=" + gender +
                '}';
    }
}

