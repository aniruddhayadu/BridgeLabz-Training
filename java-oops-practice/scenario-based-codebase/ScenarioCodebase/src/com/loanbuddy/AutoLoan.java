package com.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.0);
    }

    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 650 &&
                         applicant.getIncome() >= 20000;
        setApproved(status);
        return status;
    }

    public double calculateEMI() {
        return calculateEMIFormula(applicant.getLoanAmount(), interestRate, term);
    }
}
