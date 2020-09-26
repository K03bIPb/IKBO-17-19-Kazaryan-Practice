package ru.rtu.main.Practice7_8;

public class Employee {
    private String surname;
    private String name;
    private double salary;
    private EmployeePosition emp_pos;
    private double income = 0; // 0 by default only managers have income

    public Employee(String surname, String name, double salary, EmployeePosition emp_pos) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.emp_pos = emp_pos;
    }
    void calcIncome(){

    }

    public EmployeePosition getEmpPos() {
        return emp_pos;
    }

    public void setEmpPos(EmployeePosition emp_pos) {
        this.emp_pos = emp_pos;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
