package com.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {
    protected User owner;
    private double balance; // Encapsulation
    protected List<Transaction> history;

    public Wallet(User owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
        this.history = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
        history.add(new Transaction("Added Money", amount));
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance!");
        return false;
    }

    public void showTransactions() {
        System.out.println("Transaction History for " + owner.getName());
        for (Transaction t : history) {
            t.printTransaction();
        }
    }
}
