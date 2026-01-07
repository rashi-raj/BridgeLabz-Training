package com.day6.loanapprovalautomation;

public class Loan implements IApprovable{
	
	protected Applicant applicant;
    protected int term; 
    protected double interestRate;
    private String loanStatus; 
    
    public Loan(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }
    
    protected boolean checkEligibility(){
        return applicant.getCreditScore() >= 700 && applicant.getIncome() >= (calculateEMI() * 2);
    }
    
    @Override
    public void approveLoan() {
        if (checkEligibility()) {
            loanStatus = "APPROVED";
        } else {
            loanStatus = "REJECTED";
        }
    }
    
    public String getLoanStatus() {
        return loanStatus;
    }

    @Override
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
