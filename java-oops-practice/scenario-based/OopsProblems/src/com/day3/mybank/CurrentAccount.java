package com.day3.mybank;

public class CurrentAccount extends Account implements Transaction {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return 0;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Amount Deposited Successfully");
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Amount Withdrawn Successfully");
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + getBalance());
    }
}
