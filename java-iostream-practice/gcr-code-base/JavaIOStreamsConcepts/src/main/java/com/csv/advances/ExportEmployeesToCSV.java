package com.csv.advances;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class ExportEmployeesToCSV {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "your_password"; // change

        String csvFile = "employees_report.csv";

        String query = "SELECT id, name, department, salary FROM employees";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);
             FileWriter fw = new FileWriter(csvFile)) {

            fw.append("Employee ID,Name,Department,Salary\n");

            while (rs.next()) {
                fw.append(rs.getString("id")).append(",");
                fw.append(rs.getString("name")).append(",");
                fw.append(rs.getString("department")).append(",");
                fw.append(String.valueOf(rs.getInt("salary"))).append("\n");
            }

            System.out.println("CSV report generated successfully: " + csvFile);

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
