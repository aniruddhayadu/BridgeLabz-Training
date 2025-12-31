package com.objectmodeling;

public class Bank {
    private String bankName;

    // Constructor
    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Association: Bank opens account for Customer
    void openAccount(Customer customer, int initialBalance) {
        customer.setBalance(initialBalance);
        System.out.println("Account opened in " + bankName);
    }

    public static void main(String[] args) {

        Bank bank = new Bank("State Bank");
        Customer customer1 = new Customer("Rahul");

        bank.openAccount(customer1, 5000);
        customer1.viewBalance();
    }
}
