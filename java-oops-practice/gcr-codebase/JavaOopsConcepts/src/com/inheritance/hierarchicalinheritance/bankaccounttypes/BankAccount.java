package com.inheritance.hierarchicalinheritance.bankaccounttypes;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
