package com.bankmanagementsystem;

import java.sql.SQLException;

public interface BankDAO {

    // Create account
    void createAccount(AccountDTO account) throws SQLException;

    // Transfer money from one account to another
    void transferMoney(String sender, String receiver, double amount) throws SQLException;

    // Check balance
    void balanceCheck(String accountNumber) throws SQLException;

    // Check transaction history
    void checkTransaction(String accountNumber) throws SQLException;
}
