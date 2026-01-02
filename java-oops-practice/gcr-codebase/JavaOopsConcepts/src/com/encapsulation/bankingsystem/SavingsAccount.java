package com.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate = 4.0;
    private double loanAmount;

    SavingsAccount(String accNo, String name, double balance) {
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
        return balance >= 50000;
    }
}
