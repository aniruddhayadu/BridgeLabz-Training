package com.bankmanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankSingleton {

    private static BankSingleton instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/bankmanagement";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "777282";

    // Private constructor
    private BankSingleton() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Get instance
    public static BankSingleton getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new BankSingleton();
        }
        return instance;
    }

    // Get connection
    public Connection getConnection() {
        return connection;
    }
}
