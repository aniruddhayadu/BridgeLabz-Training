package com.bankmanagementsystem;

import java.sql.SQLException;

public class BankMain {

    public static void main(String[] args) {
        try {
            BankManagement management = new BankManagement();

            // Create accounts
            management.createAccount(new AccountDTO("RAVI", "ASDF54321", 13330.0));
            management.createAccount(new AccountDTO("KALI", "ASDF4532", 7830.0));
            management.createAccount(new AccountDTO("SURIYA", "ASDF8765", 6730.0));

            // Transfer money
            management.transferMoney("ASDF8765", "ASDF4532", 70);

            // Check balance
            management.balanceCheck("ASDF54321");

            // Check transactions
            management.checkTransaction("ASDF54321");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
