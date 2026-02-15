package com.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

    private static SingletonConnection instance;
    private Connection connection;

    private static final String URL = "jdbc:mysql://localhost:3306/employee";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "777282"; // updated password

    // Private constructor
    private SingletonConnection() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Get singleton instance (thread-safe version)
    public static synchronized SingletonConnection getInstance() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new SingletonConnection();
        }
        return instance;
    }

    // Get the connection
    public Connection getConnection() {
        return connection;
    }
}
