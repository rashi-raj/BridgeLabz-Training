package com.day6.loanapprovalautomation;

public class AutoLoan extends Loan {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5);
    }
}
