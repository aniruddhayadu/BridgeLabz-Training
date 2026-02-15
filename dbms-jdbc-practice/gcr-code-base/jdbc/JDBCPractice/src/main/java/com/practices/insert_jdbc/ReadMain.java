package com.practices.insert_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReadMain {

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/jdbcpractice";
    private static final String USER = "root";
    private static final String PASSWORD = "777282";   // <-- apna mysql password daalna

    public static void main(String[] args) {

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = connection.prepareStatement(sql);
        ) {

            System.out.println("Database Connected Successfully ✅");

            ps.setString(1, "Anni");
            ps.setString(2, "aniruddha@gmail.com");

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("User inserted successfully 🎉");
            }

        } catch (SQLException e) {
            System.out.println("Something went wrong ❌");
            e.printStackTrace();
        }
    }
}
