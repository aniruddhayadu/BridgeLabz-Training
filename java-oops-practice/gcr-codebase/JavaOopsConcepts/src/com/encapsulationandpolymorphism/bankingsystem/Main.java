package com.encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("SA1001", "Alice", 2000, 4);
        CurrentAccount ca = new CurrentAccount("CA2001", "Bob", 6000, 3);

        accounts.add(sa);
        accounts.add(ca);

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(1000);
            }

            System.out.println();
        }

        // Test deposit and withdrawal
        sa.deposit(500);
        ca.withdraw(2000);
    }
}
