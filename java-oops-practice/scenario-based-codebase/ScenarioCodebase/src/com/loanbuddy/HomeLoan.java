package com.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 700 &&
                         applicant.getIncome() >= 30000;
        setApproved(status);
        return status;
    }

    public double calculateEMI() {
        return calculateEMIFormula(applicant.getLoanAmount(), interestRate, term);
    }
}

