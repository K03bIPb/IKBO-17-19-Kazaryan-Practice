package ru.rtu.main.Practice15;

public class Company {
    public String companyName;
    public double income = 0;
    public double outcome = 0;

    public Company(String companyName) {
        this.companyName = companyName;
    }
    public void addIncome(double amount){
        income = income + amount;
    }
    public void addOutcome(double amount){
        outcome = outcome + amount;
    }

    @Override
    public String toString() {
        return  companyName + " Расходы: " + outcome + "\n";
    }
}
