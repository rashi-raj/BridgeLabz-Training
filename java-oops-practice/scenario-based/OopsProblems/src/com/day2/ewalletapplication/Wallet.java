package com.day2.ewalletapplication;

abstract class Wallet implements Transferrable {
    private double balance;   // protected from direct access

    Wallet(double balance) {
        this.balance = balance;
    }

    // (Constructor Overloading)
    Wallet(double balance, double referralBonus) {
        this.balance = balance + referralBonus;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
