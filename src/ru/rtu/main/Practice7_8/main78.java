package ru.rtu.main.Practice7_8;

import ru.rtu.main.Practice7_8.Positions.Manager;
import ru.rtu.main.Practice7_8.Positions.Operator;
import ru.rtu.main.Practice7_8.Positions.TopManager;

import java.util.Arrays;

public class main78 {
    public static void main(String[] args) {
        Employee[] employees_to_hire = new Employee[280];




        Company company = new Company(70000);

        for (int i = 0; i < employees_to_hire.length; i++) {

            if (i < 180) {
                Employee employee_to_hire_operator = new Operator("Denis", "Denisov");
                employees_to_hire[i] = employee_to_hire_operator;
            } //добавление операторов в список на найм
            else if (i < 260) {
                Employee employee_to_hire_manager = new Manager("Petr", "Petrov");
                employees_to_hire[i] = employee_to_hire_manager;
            } //добавление менеджеров в список на найм
            else if (i < 270) {
                Employee employee_to_hire_top_manager = new TopManager("Ivan", "Ivanov");
                employees_to_hire[i] = employee_to_hire_top_manager;
            } //добавление топ менеджеров в список на найм
        }
        company.hireAll(employees_to_hire); //найм сотрудников из списка


        company.calcIncome();
        System.out.println("Full company income: " + company.getFullIncome());

        int emp_to_check = 1; //проверка функций. Выбор сотрудника, о котором получается информация
        System.out.println("\nEmployee " + emp_to_check + ": ");
        System.out.println("Position: " + company.getEmployeePosition(emp_to_check));
        System.out.println("Salary: " + company.getEmployeeSalary(emp_to_check, company.getFullIncome(), company.getBaseSalary()));
        System.out.println("Income: " + company.getEmployeeIncome(emp_to_check));

        System.out.println("\n");
        toStringSalary(company.salaryList());//вывод всех сотрудников
        System.out.println("\nTop X salary list: ");
        toStringSalary(company.getTopSalaryStaff(15));
        System.out.println("\nLowest X salary list: ");
        toStringSalary((company.getLowestSalaryStaff(30)));

        for (int i = company.employees.length/2; i < company.employees.length; i++) { //увольнение 50% сотрудников
            company.fire(i);
        }
        toStringSalary(company.salaryList());
        System.out.println("\nTop X salary list: ");
        toStringSalary(company.getTopSalaryStaff(15));
        System.out.println("\nLowest X salary list: ");
        toStringSalary((company.getLowestSalaryStaff(30)));
        company.calcIncome();
        System.out.println("Full company income: " + company.getFullIncome());
        System.out.println("Full company income = 0 because all managers are gone after 50% fire");
    }

    private static void toStringSalary(double[] salary) {
        for (int i = 0; i < salary.length; i++) {
            System.out.println((int) salary[i] + " руб.");
        }
    }
    private static void toStringStaff(Employee[] employees){
        System.out.println("Employee list: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i] + " ");
        }
    }
}
