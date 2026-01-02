package com.day1.banksystem;

class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: Rs" + interest);
    }
}
