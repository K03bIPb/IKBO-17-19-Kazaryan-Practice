package ru.rtu.main.Practice7_8.Positions;

import ru.rtu.main.Practice7_8.EmployeePosition;

public class Operator implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary, double income) {
        return baseSalary;
    }
}