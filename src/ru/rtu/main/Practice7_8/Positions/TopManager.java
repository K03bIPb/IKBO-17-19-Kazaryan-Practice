package ru.rtu.main.Practice7_8.Positions;

import ru.rtu.main.Practice7_8.EmployeePosition;

public class TopManager implements EmployeePosition {

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
