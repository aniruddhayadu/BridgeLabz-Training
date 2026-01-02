package com.ewalletapplication;

public class User {
    private String name;
    private Wallet wallet;

    public User(String name, boolean isBusiness, double initialBalance, boolean hasReferral) {
        this.name = name;
        double bonus = hasReferral ? 100 : 0; // referral bonus

        if (isBusiness) {
            wallet = new BusinessWallet(this, initialBalance + bonus);
        } else {
            wallet = new PersonalWallet(this, initialBalance + bonus);
        }
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void addMoney(double amount) {
        wallet.addBalance(amount);
        System.out.println("₹" + amount + " added to wallet.");
    }

    public void transferMoney(User receiver, double amount) {
        wallet.transferTo(receiver, amount);
    }

    public void viewTransactions() {
        wallet.showTransactions();
    }

    public double getBalance() {
        return wallet.getBalance();
    }
}
