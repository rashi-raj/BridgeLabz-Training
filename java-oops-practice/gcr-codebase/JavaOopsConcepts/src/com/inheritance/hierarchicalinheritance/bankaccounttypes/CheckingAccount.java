package com.inheritance.hierarchicalinheritance.bankaccounttypes;

class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Daily Withdrawal Limit: Rs" + withdrawalLimit);
    }
}
