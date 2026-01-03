package com.mybank;

abstract class Account {
    protected String accountNumber;   
    private double balance;            

    // Constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    protected double getBalance() {
        return balance;
    }

    protected void updateBalance(double amount) {
        this.balance = amount;
    }

    public abstract double calculateInterest();
}
