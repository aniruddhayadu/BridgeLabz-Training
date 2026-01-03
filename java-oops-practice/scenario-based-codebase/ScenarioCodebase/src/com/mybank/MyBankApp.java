package com.mybank;

public class MyBankApp {
    public static void main(String[] args) {

        Account savingsAccount = new SavingsAccount("SB101", 5000);
        Account currentAccount = new CurrentAccount("CA201", 3000);

        ITransaction savings = (ITransaction) savingsAccount;
        ITransaction current = (ITransaction) currentAccount;

        savings.deposit(2000);
        savings.withdraw(1000);
        System.out.println("Savings Balance: " + savings.checkBalance());
        System.out.println("Savings Interest: " + savingsAccount.calculateInterest());

        current.deposit(1500);
        current.withdraw(4000);
        System.out.println("Current Balance: " + current.checkBalance());
        System.out.println("Current Interest: " + currentAccount.calculateInterest());
    }
}


