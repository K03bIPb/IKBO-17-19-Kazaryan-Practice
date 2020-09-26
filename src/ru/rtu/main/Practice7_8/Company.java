package ru.rtu.main.Practice7_8;
import java.util.Arrays;
import java.util.Random;

public class Company {
    private int last_empty_place = 0;
    private int emp_max = 100;
    private double full_income = 0; //0 by default need to calc
    Employee[] employees = new Employee[emp_max];
    public void hire(Employee employee_to_hire){
        employees[last_empty_place] = employee_to_hire;
        last_empty_place++;
    }
    public void calcIncome(){
        for (int i=0;i<last_empty_place;i++)
            if (employees[i].getEmpPos().toString() == "Manager"){
                employees[i].get
            }
    }


    public void hireAll(Employee[] employees_to_hire){
        if (employees_to_hire.length + last_empty_place < emp_max) {
            System.out.println("employee firelist does not fit emp list! Emp list not extended!");
        }
        else {
            for (int i = 0; i < employees_to_hire.length; i++)
                employees[last_empty_place] = employees_to_hire[i];
            }
    }
    public void fire(int emp_to_fire){
        employees[emp_to_fire] = null;
    }
    public double getIncome(){
        return ;
    }
}
