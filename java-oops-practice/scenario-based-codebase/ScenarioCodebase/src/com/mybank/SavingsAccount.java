package com.mybank;

class SavingsAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }


    public void deposit(double amount) {
        updateBalance(getBalance() + amount);
    }

   
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            updateBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    
    public double checkBalance() {
        return getBalance();
    }

  
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}

