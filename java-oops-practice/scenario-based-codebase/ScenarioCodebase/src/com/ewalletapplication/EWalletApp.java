package com.ewalletapplication;

public class EWalletApp {
    public static void main(String[] args) {

        User alice = new User("Alice", false, 1000, true); // personal wallet + referral
        User bob = new User("Bob", true, 5000, false);      // business wallet

        System.out.println("Alice Balance: ₹" + alice.getBalance());
        System.out.println("Bob Balance: ₹" + bob.getBalance());

        // Add money
        alice.addMoney(500);

        // Transfer money
        alice.transferMoney(bob, 200);   // Personal wallet: ₹200 + tax
        bob.transferMoney(alice, 3000);  // Business wallet: No tax

        // Show balances
        System.out.println("Alice Balance: ₹" + alice.getBalance());
        System.out.println("Bob Balance: ₹" + bob.getBalance());

        // View transaction history
        alice.viewTransactions();
        bob.viewTransactions();
    }
}

