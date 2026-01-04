package com.day3.mybank;

public interface Transaction {

    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
