package com.day1.banksystem;

public class Main{
    public static void main(String[] args) {

        // Savings Account Customer
        SavingsAccount sa = new SavingsAccount(101, 5000, 5);
        Customer c1 = new Customer("Rohan", sa);

        c1.deposit(2000);
        sa.calculateInterest();
        c1.withdraw(1500);
        c1.showBalance();

        System.out.println();

        // Current Account Customer
        CurrentAccount ca = new CurrentAccount(102, 8000);
        Customer c2 = new Customer("Anjali", ca);

        c2.withdraw(3000);
        c2.deposit(1000);
        c2.showBalance();
    }
}
