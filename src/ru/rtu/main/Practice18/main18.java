package ru.rtu.main.Practice18;

import ru.rtu.main.Practice18.Materials.Transactions.src.Account;
import ru.rtu.main.Practice18.Materials.Transactions.src.Bank;

import java.util.ArrayList;

public class main18 {
    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account("12345678", 1000);
        Account account2 = new Account("12456743", 3000);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        Bank bank = new Bank(accounts);

        System.out.println("\nAccount1 balance: " + bank.getBalance(account1.getAccNumber()));
        System.out.println("\nAccount2 balance: " + bank.getBalance(account2.getAccNumber()));

        bank.transfer(account1.getAccNumber(), account2.getAccNumber(), 1000);

        System.out.println("\nAccount1 balance: " + bank.getBalance(account1.getAccNumber()));
        System.out.println("\nAccount2 balance: " + bank.getBalance(account2.getAccNumber()));;

        bank.transfer(account2.getAccNumber(), account2.getAccNumber(), 5000);

        System.out.println("\nAccount1 balance: " + bank.getBalance(account1.getAccNumber()));
        System.out.println("\nAccount2 balance: " + bank.getBalance(account2.getAccNumber()));;
    }
}
