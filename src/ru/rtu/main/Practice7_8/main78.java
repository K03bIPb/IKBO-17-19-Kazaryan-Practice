package ru.rtu.main.Practice7_8;
import ru.rtu.main.Practice7_8.Positions.Manager;
import ru.rtu.main.Practice7_8.Positions.Operator;
import ru.rtu.main.Practice7_8.Positions.TopManager;

import java.util.Arrays;

public class main78 {
    public static void main(String[] args) {
        Employee[] employees_to_hire = new Employee[180];
        Employee employee_to_hire = new Manager("Petr", "Petrov");
        for (int i = 0; i < employees_to_hire.length; i++) {
            employees_to_hire[i] = employee_to_hire;
        }
        Employee employee_to_hire_top_manager = new TopManager("Ivan", "Ivanov");
        Employee employee_to_hire_operator = new Operator("Denis", "Denisov");

        Company company = new Company(30000);

        company.hire(employee_to_hire_top_manager);
        company.hire(employee_to_hire_operator);
        company.hireAll(employees_to_hire);

        company.calcIncome();

        System.out.println(Arrays.toString(company.getEmployeeList()));
        System.out.println(company.getFullIncome());
        System.out.println(company.getEmployeePosition(0));
        System.out.println(company.getEmployeeSalary(0, company.getFullIncome(), company.getBaseSalary()));

    }
}
