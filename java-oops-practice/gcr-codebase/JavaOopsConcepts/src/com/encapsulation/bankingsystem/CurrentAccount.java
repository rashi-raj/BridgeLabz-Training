package com.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {

    private double interestRate = 2.0;
    private double loanAmount;

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        loanAmount = amount;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}
