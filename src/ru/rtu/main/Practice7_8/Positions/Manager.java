package ru.rtu.main.Practice7_8.Positions;
import ru.rtu.main.Practice7_8.Employee;
import ru.rtu.main.Practice7_8.EmployeePosition;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    private final Random rand = new Random();
    private final double income = rand.nextInt(140000) + 115000;

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public double getIncome() {
        return income;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double full_income, double baseSalary) {
        return baseSalary+0.05*income;
    }

}
