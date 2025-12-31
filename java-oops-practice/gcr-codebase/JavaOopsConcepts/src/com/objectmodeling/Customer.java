package com.objectmodeling;

public class Customer {
    private String name;
    private int balance;

    // Constructor
    Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    // Method to view balance
    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }

    // Method used by Bank to update balance
    void setBalance(int amount) {
        this.balance = amount;
    }
}
