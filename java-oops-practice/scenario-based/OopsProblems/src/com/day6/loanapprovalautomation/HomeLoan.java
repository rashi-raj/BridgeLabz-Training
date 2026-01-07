package com.day6.loanapprovalautomation;

public class HomeLoan extends Loan {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5); 
    }

    @Override
    public double calculateEMI() {
        return super.calculateEMI();
    }
}
