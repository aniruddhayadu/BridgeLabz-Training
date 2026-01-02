package com.ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(User owner, double initialBalance) {
        super(owner, initialBalance);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        double tax = 5; // flat tax for personal transfers
        double total = amount + tax;

        if (deductBalance(total)) {
            receiver.getWallet().addBalance(amount);
            history.add(new Transaction("Transferred ₹" + amount + " to " + receiver.getName(), total));
            System.out.println("Transfer successful: ₹" + amount + " + Tax ₹" + tax);
            return true;
        }
        return false;
    }
}
