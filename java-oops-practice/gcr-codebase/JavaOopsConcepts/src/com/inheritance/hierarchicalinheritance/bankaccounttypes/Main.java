package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA202", 30000, 20000);
        BankAccount acc3 = new FixedDepositAccount("FD303", 100000, 5);

        acc1.displayDetails();
        ((SavingsAccount) acc1).displayAccountType();

        System.out.println();

        acc2.displayDetails();
        ((CheckingAccount) acc2).displayAccountType();

        System.out.println();

        acc3.displayDetails();
        ((FixedDepositAccount) acc3).displayAccountType();
    }
}