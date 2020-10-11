package ru.rtu.main.Practice9;
import java.time.LocalDate;

public class Employee {
    private String name;
    private String surname;
    private final LocalDate birthDate;
    private String regPlace;
    private long phoneNumber;
    private double salary;

    public Employee(String name, String surname, LocalDate birthDate, String regPlace, long phoneNumber, double salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.regPlace = regPlace;
        this.phoneNumber = phoneNumber;
        this.salary = salary;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getRegPlace() {
        return regPlace;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }
}
