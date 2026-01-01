package com.encapsulationandpolymorphism.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // in percentage

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account.");
        } else {
            System.out.println("Loan not eligible for Savings Account.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 1000; // eligible if balance >= 1000
    }
}
