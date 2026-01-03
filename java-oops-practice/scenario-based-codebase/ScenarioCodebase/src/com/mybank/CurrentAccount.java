package com.mybank;

class CurrentAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 1.0;

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

   
    public void deposit(double amount) {
        updateBalance(getBalance() + amount);
    }


    
    public void withdraw(double amount) {
        updateBalance(getBalance() - amount); // overdraft allowed
    }


    public double checkBalance() {
        return getBalance();
    }

   
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
