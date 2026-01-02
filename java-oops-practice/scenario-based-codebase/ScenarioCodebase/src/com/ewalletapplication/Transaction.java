package com.ewalletapplication;

import java.time.LocalDateTime;

public class Transaction {
    private String details;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(String details, double amount) {
        this.details = details;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public void printTransaction() {
        System.out.println(dateTime + " | " + details + " | Amount: ₹" + amount);
    }
}

