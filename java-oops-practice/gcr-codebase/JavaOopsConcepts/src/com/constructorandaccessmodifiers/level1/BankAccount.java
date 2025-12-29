package com.constructorandaccessmodifiers.level1;

public class BankAccount {

    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
