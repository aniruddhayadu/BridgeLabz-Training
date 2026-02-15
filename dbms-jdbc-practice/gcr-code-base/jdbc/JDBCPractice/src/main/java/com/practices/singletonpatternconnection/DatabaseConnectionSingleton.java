package com.practices.singletonpatternconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {

    private static DatabaseConnectionSingleton instance; 
    private Connection connection;                    
    
    private static final String URL = "jdbc:mysql://localhost:3306/jdbcpractice";
    private static final String USER = "root";
    private static final String PASSWORD = "777282";

    // Private constructor
    private DatabaseConnectionSingleton() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Public method to get instance
    public static DatabaseConnectionSingleton getInstance() throws SQLException {

        if (instance == null || instance.getConnection().isClosed()) {
            instance = new DatabaseConnectionSingleton();
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
