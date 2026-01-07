package com.loanbuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 12.5);
    }

    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 600;
        setApproved(status);
        return status;
    }

    public double calculateEMI() {
        return calculateEMIFormula(applicant.getLoanAmount(), interestRate, term);
    }
}

