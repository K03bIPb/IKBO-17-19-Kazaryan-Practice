package ru.rtu.main.Practice7_8;

abstract public class Employee {
    private String surname;
    private String name;
    private EmployeePosition positions;

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

    public double getSalary(double full_income, double baseSalary){
        return positions.calcSalary(full_income, baseSalary);
    }
    public String getPosition(){
        return positions.getJobTitle();
    }

    abstract public double getIncome();

    @Override
    public String toString() {
        return  "\n" + name + " " + surname;
    }
}

