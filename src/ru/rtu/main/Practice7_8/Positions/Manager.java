package ru.rtu.main.Practice7_8.Positions;
import ru.rtu.main.Practice7_8.EmployeePosition;

import java.util.Random;

public class Manager implements EmployeePosition {
    private Random rand = new Random();
    private double income = rand.nextInt(140000) + 115000;

    public double getIncome() {
        return income;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary, double income) {
        return baseSalary+0.05*income;
    }
}
