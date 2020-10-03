package ru.rtu.main.Practice9;

import java.util.ArrayList;

public class Company{
    ArrayList<Employee> employees = new ArrayList<Employee>();
    public void hire(Employee employee){
        employees.add(employee);
    }
    public void fire(int index_emp_to_fire) {
        employees.remove(index_emp_to_fire);
    }

    public void doThings(HandleImployees handle){
        for (int i = 0; i < employees.size(); i++) {
            handle.doEverything(employees.get(i));
        }

    }
}
