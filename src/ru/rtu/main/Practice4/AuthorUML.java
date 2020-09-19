package ru.rtu.main.Practice4;

public class AuthorUML {
    private String name;
    private String email;
    private char gender;
    public AuthorUML(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "AuthorUML{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
