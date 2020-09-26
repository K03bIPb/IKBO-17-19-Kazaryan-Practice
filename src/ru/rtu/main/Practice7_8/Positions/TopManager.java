package ru.rtu.main.Practice7_8.Positions;

import ru.rtu.main.Practice7_8.Employee;
import ru.rtu.main.Practice7_8.EmployeePosition;

public class TopManager extends Employee implements EmployeePosition {

    public TopManager(String name, String surname) {
        super(name, surname);
    }
    public double calcTopManagerSalary(double full_income, double baseSalary) {
        if (full_income > 10000000) {
            return baseSalary + 1.5 * baseSalary;
        } else return baseSalary;

    }
    @Override
    public double getIncome() {
        return 0;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    }

    @Override
    public double calcSalary( double fullIncome, double baseSalary) {
        return calcTopManagerSalary(fullIncome, baseSalary);
    }


}
