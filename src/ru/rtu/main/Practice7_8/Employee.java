package ru.rtu.main.Practice7_8;

abstract public class Employee implements EmployeePosition {
    private String surname;
    private String name;
    private int seed = (int) (Math.random()%25000 +115000);


    public int getSeed() {
        return seed;
    }

    public Employee(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public int getIncome();

    @Override
    public String toString() {
        return  name + ' ' + surname + "  (" + getJobTitle() + ")" ;
    }
}

