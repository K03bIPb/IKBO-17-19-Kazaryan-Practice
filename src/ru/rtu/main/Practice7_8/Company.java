package ru.rtu.main.Practice7_8;

public class Company {
    private int last_empty_place = 0;
    private final int emp_max = 300;
    private final double baseSalary;
    private int fullIncome = 0; //0 by default need to calc
    private final Employee[] employees = new Employee[emp_max];

    public Company(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void calcIncome() {
        fullIncome = 0;
        for (int i = 0; i < last_empty_place; i++)
            if (employees[i] != null) fullIncome = fullIncome + employees[i].getIncome();
    }

    public void hire(Employee employee_to_hire) {
        if (employees[last_empty_place] == null) {
            employees[last_empty_place] = employee_to_hire;
            last_empty_place++;
        } else System.out.println("\nThis employee place is not empty!");
    }

    public void hireAll(Employee[] employees_to_hire) {
        if (employees_to_hire.length + last_empty_place < emp_max) {
            int a = last_empty_place;
            for (int i = a; i < employees_to_hire.length + a; i++) {
                employees[i] = employees_to_hire[i - a];
                last_empty_place++;
            }
        } else {
            System.out.println("\nEmployee fire list does not fit emp list — emp list not extended!");
        }
    }

    public void fire(int emp_to_fire) {
        if (employees[emp_to_fire] != null) {
            employees[emp_to_fire] = null;
            for (int i = emp_to_fire; i < employees.length - 1; i++) {
                employees[i] = employees[i + 1];
            }
            last_empty_place = last_empty_place - 1;
            System.out.println("\nEmployee " + emp_to_fire + " fired and replaced with previous!");
        } else {
            System.out.println("\n" + emp_to_fire + " place is already empty!");
        }
    }

    public Employee[] getEmployeeList() {
        return employees;
    }

    public int getFullIncome() {
        return fullIncome;
    }

    public String getEmployeePosition(int emp_place) {
        if (employees[emp_place] != null) {
            return employees[emp_place].getJobTitle();
        } else {
            return "\nThis place is empty!";
        }
    }

    public double getEmployeeSalary(int emp_place, double fullIncome, double baseSalary) {
        if (employees[emp_place] != null) {
            return employees[emp_place].calcSalary(fullIncome, baseSalary);
        } else {
            return 0;
        }
    }
    public double fullSalaryPayment(){
        double fullSalaryPayment = 0;
        for (int i = 0; i < employees.length; i++) {
            fullSalaryPayment = fullSalaryPayment + employees[i].calcSalary(fullIncome, baseSalary);
        }
        return fullSalaryPayment;
    }
    public double calcFureIncome(){
        return fullIncome - fullSalaryPayment();
    }

    public double[] getTopSalaryStaff(int count) {
        double[] topSalaryStaff = new double[count];
        if (employees[0] != null) {
            double maxSalary = 0;
            double prevMaxSalary = 0;
            for (int j = 0; j < count; j++) {
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i] != null) {
                        if ((maxSalary < employees[i].calcSalary(fullIncome, baseSalary)) && (prevMaxSalary != employees[i].calcSalary(fullIncome, baseSalary)))
                            maxSalary = employees[i].calcSalary(fullIncome, baseSalary);
                    } else {
                        i = employees.length;
                        if(maxSalary < prevMaxSalary){
                        prevMaxSalary = maxSalary;
                        topSalaryStaff[j] = maxSalary;
                        maxSalary = 0;
                    }
                }
            }}
        } else System.out.println("\nThere is no staff in there!");
        return topSalaryStaff;
    }

    public int getEmployeeIncome(int emp_place) {
        if (employees[emp_place] != null)
            return employees[emp_place].getIncome();
        else return 0;
    }
}

