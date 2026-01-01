package com.inheritance.bankaccount;

public class FixedDepositAccount extends BankAccount {
    private int tenureMonths;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountInfo();
        System.out.println("Tenure: " + tenureMonths + " months");
    }
}

