package ru.rtu.main.Practice7_8;
import ru.rtu.main.Practice7_8.Positions.Manager;
import ru.rtu.main.Practice7_8.Positions.Operator;
import ru.rtu.main.Practice7_8.Positions.TopManager;

import java.util.Arrays;

public class main78 {
    public static void main(String[] args) {
        Employee[] employees_to_hire = new Employee[280];


        Employee employee_to_hire_top_manager = new TopManager("Ivan", "Ivanov");
        Employee employee_to_hire_operator = new Operator("Denis", "Denisov");
        Employee employee_to_hire_manager = new Manager("Petr", "Petrov");

        Company company = new Company(70000);

        for(int i=0;i<employees_to_hire.length;i++) {
            if(i<180) employees_to_hire[i] = employee_to_hire_operator;
            else if (i<260) employees_to_hire[i] = employee_to_hire_manager;
            else if (i < 270) employees_to_hire[i] = employee_to_hire_top_manager;
        }

        company.hireAll(employees_to_hire);

        int emp_to_fire = 183;
        int emp_to_check = 1;
        company.calcIncome();
        System.out.println("\nEmployees list: " + "\n" + Arrays.toString(company.getEmployeeList()));
        System.out.println("Full company income: " + company.getFullIncome());
        company.fire(emp_to_fire);



        company.calcIncome();

        System.out.println("Employees list: " + "\n" + Arrays.toString(company.getEmployeeList()));
        System.out.println("Full company income: " + company.getFullIncome());

        System.out.println("\nEmployee " + emp_to_check + ": ");
        System.out.println("Position: " + company.getEmployeePosition(emp_to_check));
        System.out.println("Salary: " + company.getEmployeeSalary( emp_to_check, company.getFullIncome(), company.getBaseSalary()));
        System.out.println("Income: " + company.getEmployeeIncome(emp_to_check));
        System.out.println("" + Arrays.toString(company.getTopSalaryStaff(10)));
    }
}
