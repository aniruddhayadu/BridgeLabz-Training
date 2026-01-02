package com.ewalletapplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet(User owner, double initialBalance) {
        super(owner, initialBalance);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        // No tax, but max limit per transfer = 50000
        if (amount > 50000) {
            System.out.println("BusinessWallet transfer limit exceeded!");
            return false;
        }

        if (deductBalance(amount)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Transferred ₹" + amount + " to " + receiver.getName(), amount));
            System.out.println("Business transfer successful: ₹" + amount);
            return true;
        }
        return false;
    }
}
