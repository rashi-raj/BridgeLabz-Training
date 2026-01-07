package com.day6.loanapprovalautomation;

import java.util.Scanner;

public class LoanBuddyApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to LoanBuddy ===");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Loan Type (personal/home/auto): ");
        String loanType = sc.nextLine();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        Loan loan = null;

        switch (loanType.toLowerCase()) {
            case "home":
                loan = new HomeLoan(applicant, term);
                break;
            case "auto":
                loan = new AutoLoan(applicant, term);
                break;
            case "personal":
                loan = new PersonalLoan(applicant, term);
                break;
            default:
                System.out.println("Invalid Loan Type!");
                return;
        }

        loan.approveLoan();
        double emi = loan.calculateEMI();

        System.out.println("\n--- Loan Summary ---");
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Status: " + loan.getLoanStatus());
        System.out.println("Monthly EMI: Rs" + String.format("%.2f", emi));

        sc.close();
    }
}
