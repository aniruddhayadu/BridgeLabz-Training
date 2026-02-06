package com.multithreading.bankingsystem;

public class Transaction implements Runnable {

    private double amount;
    private BankAccount bankAccount;

    public Transaction(double amount, BankAccount bankAccount) {
        this.amount = amount;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
