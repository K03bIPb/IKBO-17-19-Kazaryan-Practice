package ru.rtu.main.Practice7_8.Positions;

import ru.rtu.main.Practice7_8.Employee;
import ru.rtu.main.Practice7_8.EmployeePosition;

public class Operator extends Employee implements EmployeePosition {

    public Operator(String name, String surname) {
        super(name, surname);
    }
    @Override
    public int getIncome() {
        return 0;
    }


    @Override
    public String getJobTitle() {
        return "operator";
    }

    @Override
    public double calcSalary(double fullIncome, double baseSalary) {
        return baseSalary;
    }
}