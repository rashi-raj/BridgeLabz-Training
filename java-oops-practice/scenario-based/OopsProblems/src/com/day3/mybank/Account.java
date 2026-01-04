package com.day3.mybank;

abstract class Account {

    String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter for controlled update
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    abstract double calculateInterest();
}
