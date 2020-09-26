package ru.rtu.main.Practice7_8;

public class Company {
    private int last_empty_place = 0;
    private final int emp_max = 200;
    private final double baseSalary;
    private double fullIncome = 0; //0 by default need to calc
    private final Employee[] employees = new Employee[emp_max];

    public Company(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void calcIncome() {
        for (int i = 0; i < last_empty_place; i++)
            fullIncome = fullIncome + employees[i].getIncome();
    }
    public void hire(Employee employee_to_hire) {
        employees[last_empty_place] = employee_to_hire;
        last_empty_place++;
    }
    public void hireAll(Employee[] employees_to_hire) {
        if (employees_to_hire.length + last_empty_place < emp_max) {
            int a = last_empty_place;
            for (int i = a; i < employees_to_hire.length + a; i++) {
                employees[i] = employees_to_hire[i-a];
                last_empty_place++;
            }
        }
        else {
            System.out.println("employee fire list does not fit emp list — emp list not extended!");
        }
    }
    public void fire(int emp_to_fire) {
        employees[emp_to_fire] = null;
    }
    public Employee[] getEmployeeList(){
        return employees;
    }
    public double getFullIncome(){
        return fullIncome;
    }
    public String getEmployeePosition(int emp_place) {
        return employees[emp_place].getPosition();
    }
    public double getEmployeeSalary(int emp_place, double fullIncome, double baseSalary){
        return employees[emp_place].getSalary(fullIncome, baseSalary);
    }

}
