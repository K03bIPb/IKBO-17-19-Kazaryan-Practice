package ru.rtu.main.Practice7_8;

public class Company {
    private int last_empty_place = 0;
    private final int emp_max = 300;
    public final double baseSalary;
    public int fullIncome = 0; //0 by default need to calc
    public Employee[] employees = new Employee[emp_max];

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
            //System.out.println("Employee " + emp_to_fire + " fired!");
            //for (int i = emp_to_fire; i < employees.length - 1; i++) {
            //employees[i] = employees[i + 1];
            // }
            //System.out.println("\nEmployee " + emp_to_fire + " fired and replaced with previous!");
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
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null)
                fullSalaryPayment = fullSalaryPayment + employees[i].calcSalary(fullIncome, baseSalary);

        return fullSalaryPayment;
    }

    public double calcPureIncome(){
        return fullIncome - fullSalaryPayment();
    }

    public double[] salaryList() {
        double[] salaryList = new double[employees.length];
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null)
                salaryList[i] = employees[i].calcSalary(fullIncome, baseSalary);
        return salaryList;
    }

    public double[] getTopSalaryStaff(int count) {
        double[] topSalaryList = salaryList();
        double[] topXSalaryStaff = new double[count];
        if ((count <= 0)||(count > employees.length)) return topXSalaryStaff;
        else{
            for (int j = 0; j < topSalaryList.length; j++) {
                for (int i = 0; i < topSalaryList.length - 1; i++) {
                    if (topSalaryList[i] < topSalaryList[i + 1]) {
                        double bubble = topSalaryList[i];
                        topSalaryList[i] = topSalaryList[i + 1];
                        topSalaryList[i + 1] = bubble;
                    }
                }
        for (int i = 0; i < count; i++)
            topXSalaryStaff[i] = topSalaryList[i];
        }
            return topXSalaryStaff;}
    }
    public double[] getLowestSalaryStaff(int count) {
        double[] sortedSalaryList = getTopSalaryStaff(employees.length);
        double[] topXLowestSalaryList = new double[count];
        if ((count <= 0)||(count > employees.length)) return topXLowestSalaryList;
        else {
            int j = 0;
            for (int i = sortedSalaryList.length - 1; i > sortedSalaryList.length - count - 1; i--) {
                if (sortedSalaryList[i] != 0.0) {
                    topXLowestSalaryList[j] = sortedSalaryList[i];
                    j++;
                } else count++;
            }
            return topXLowestSalaryList;
        }
    }


    public int getEmployeeIncome(int emp_place) {
        if (employees[emp_place] != null)
            return employees[emp_place].getIncome();
        else return 0;
    }
}

