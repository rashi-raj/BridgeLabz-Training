package com.encapsulation.bankingsystem;

public class Main {

    static void processAccount(BankAccount account) {

        account.displayDetails();
        double interest = account.calculateInterest();
        System.out.println("Interest Earned: Rs" + interest);

        if (account instanceof Loanable) {
            boolean eligible = ((Loanable) account).calculateLoanEligibility();
            System.out.println("Loan Eligible: " + (eligible ? "Yes" : "No"));
        }

        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", "Ravi", 60000);
        BankAccount acc2 = new CurrentAccount("CA202", "Anita", 120000);

        acc1.deposit(5000);
        acc2.withdraw(20000);

        BankAccount[] accounts = { acc1, acc2 };

        for (BankAccount acc : accounts) {
            processAccount(acc);
        }
    }
}
