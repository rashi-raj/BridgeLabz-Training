package com.inheritance.hierarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {
    private int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " years");
    }
}

