package com.day3.mybank;

public class SavingsAccount extends Account implements Transaction {

    private double INTEREST_RATE = 5;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Amount Deposited Successfully");
    }

    @Override
    public void withdraw(double amount){
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Amount Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + getBalance());
    }
}
