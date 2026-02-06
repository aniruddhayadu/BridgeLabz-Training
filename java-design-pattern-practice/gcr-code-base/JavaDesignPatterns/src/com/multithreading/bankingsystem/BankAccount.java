package com.multithreading.bankingsystem;

import java.time.LocalDateTime;

public class BankAccount {

    private double balance = 10000;

    public void withdraw(double amount) {

        String customer = Thread.currentThread().getName();
        System.out.println("[" + customer + "] Attempting to withdraw " + amount);

        if (balance >= amount && amount > 0) {
            try {
                Thread.sleep(500); // simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println(
                "Transaction successful: " + customer +
                ", Amount: " + amount +
                ", Balance: " + balance +
                ", Time: " + LocalDateTime.now()
            );
        } else {
            System.out.println(
                "Transaction failed: " + customer +
                ", Amount: " + amount +
                ", Balance: " + balance +
                ", Time: " + LocalDateTime.now()
            );
        }
    }
}
