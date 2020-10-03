package ru.rtu.main.Practice7_8.Positions;
import ru.rtu.main.Practice7_8.Employee;
import ru.rtu.main.Practice7_8.EmployeePosition;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    Random rand = new Random();
    private double income = rand.nextInt(25000) + 115000;

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public int getIncome() {
        return (int) income;
    }


    @Override
    public String getJobTitle() {
        return "manager";
    }

    @Override
    public double calcSalary(double fullIncome, double baseSalary) {
        return baseSalary+0.05*income;
    }

}
