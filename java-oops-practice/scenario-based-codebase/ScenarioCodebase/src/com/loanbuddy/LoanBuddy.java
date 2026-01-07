package com.loanbuddy;

public class LoanBuddy {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Titu Sharma",
                720,
                50000,
                500000
        );

        LoanApplication loan = new HomeLoan(applicant, 240);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved ");
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } else {
            System.out.println("Loan Rejected ");
        }
    }
}
