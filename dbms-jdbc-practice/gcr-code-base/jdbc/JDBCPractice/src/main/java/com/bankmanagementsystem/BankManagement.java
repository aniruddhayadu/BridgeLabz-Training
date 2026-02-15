package com.bankmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankManagement implements BankDAO {

    private final Connection connection;

    public BankManagement() throws SQLException {
        BankSingleton singleton = BankSingleton.getInstance();
        this.connection = singleton.getConnection();
    }

    @Override
    public void createAccount(AccountDTO account) throws SQLException {

        String sql = "INSERT INTO accounts (accountHolderName, accountNumber, balance) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, account.getAccountHolderName());
            statement.setString(2, account.getAccountNumber());
            statement.setDouble(3, account.getBalance());

            int row = statement.executeUpdate();

            if (row > 0) {
                System.out.println("Account created successfully. Account Number: "
                        + account.getAccountNumber());
            }
        }
    }

    @Override
    public void transferMoney(String sender, String receiver, double amount) throws SQLException {

        try {
            connection.setAutoCommit(false);

            // Deduct from sender
            String deductSql = "UPDATE accounts SET balance = balance - ? WHERE accountNumber = ?";
            try (PreparedStatement statement1 = connection.prepareStatement(deductSql)) {
                statement1.setDouble(1, amount);
                statement1.setString(2, sender);

                int row1 = statement1.executeUpdate();
                if (row1 == 0) {
                    throw new SQLException("Sender account not found.");
                }
            }

            // Add to receiver
            String addSql = "UPDATE accounts SET balance = balance + ? WHERE accountNumber = ?";
            try (PreparedStatement statement2 = connection.prepareStatement(addSql)) {
                statement2.setDouble(1, amount);
                statement2.setString(2, receiver);

                int row2 = statement2.executeUpdate();
                if (row2 == 0) {
                    throw new SQLException("Receiver account not found.");
                }
            }

            // Insert transaction record
            String transactionSql = "INSERT INTO transactions (sender_accountNumber, receiver_accountNumber, amount) VALUES (?, ?, ?)";
            try (PreparedStatement statement3 = connection.prepareStatement(transactionSql)) {
                statement3.setString(1, sender);
                statement3.setString(2, receiver);
                statement3.setDouble(3, amount);
                statement3.executeUpdate();
            }

            connection.commit();
            System.out.println("Transaction completed successfully.");

        } catch (SQLException e) {
            connection.rollback();
            throw e;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public void balanceCheck(String accountNumber) throws SQLException {

        String sql = "SELECT accountHolderName, accountNumber, balance FROM accounts WHERE accountNumber = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, accountNumber);

            try (ResultSet result = statement.executeQuery()) {

                if (result.next()) {
                    double balance = result.getDouble("balance");
                    System.out.println("Current Balance for " + accountNumber + ": " + balance);
                } else {
                    System.out.println("Account not found.");
                }
            }
        }
    }

    @Override
    public void checkTransaction(String accountNumber) throws SQLException {

        String sql =
                "SELECT s.accountHolderName AS sender_name, " +
                "s.accountNumber AS sender_account, " +
                "r.accountHolderName AS receiver_name, " +
                "r.accountNumber AS receiver_account, " +
                "t.amount " +
                "FROM transactions t " +
                "JOIN accounts s ON t.sender_accountNumber = s.accountNumber " +
                "JOIN accounts r ON t.receiver_accountNumber = r.accountNumber " +
                "WHERE t.sender_accountNumber = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, accountNumber);

            try (ResultSet result = statement.executeQuery()) {

                while (result.next()) {
                    System.out.println(
                            result.getString("sender_name") + " | " +
                            result.getString("sender_account") + " | " +
                            result.getString("receiver_name") + " | " +
                            result.getString("receiver_account") + " | " +
                            result.getDouble("amount")
                    );
                }
            }
        }
    }
}
