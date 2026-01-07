package com.day6.loanapprovalautomation;

public class PersonalLoan extends Loan {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 13.5);
    }
}
