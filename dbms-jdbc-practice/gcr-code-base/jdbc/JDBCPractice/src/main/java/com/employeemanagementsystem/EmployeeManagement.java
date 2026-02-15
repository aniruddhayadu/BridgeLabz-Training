package com.employeemanagementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeManagement {

    private final SingletonConnection connection;

    public EmployeeManagement() throws SQLException {
        this.connection = SingletonConnection.getInstance();
    }

    // Add employee
    public void addEmployee(Employee e) throws SQLException {
        String sql = "INSERT INTO employee_data(emp_Name, emp_Department, emp_Salary) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, e.getEmployeeName());
            statement.setString(2, e.getDepartment());
            statement.setDouble(3, e.getSalary());

            int row = statement.executeUpdate();
            if (row > 0) {
                try (ResultSet result = statement.getGeneratedKeys()) {
                    if (result.next()) {
                        int id = result.getInt(1);
                        e.setEmpId(id);
                        System.out.println("Added employee with ID: " + id);
                    }
                }
            }
        }
    }

    // View all employees
    public void viewAllEmployees() throws SQLException {
        String sql = "SELECT * FROM employee_data";
        try (PreparedStatement statement = connection.getConnection().prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {
                Employee emp = new Employee(
                        result.getInt("emp_Id"),
                        result.getString("emp_Name"),
                        result.getString("emp_Department"),
                        result.getInt("emp_Salary")
                );
                System.out.println(emp);
            }
        }
    }

    // Update employee salary by ID
    public void updateEmployeeSalary(int id, int salary) throws SQLException {
        String sql = "UPDATE employee_data SET emp_Salary = ? WHERE emp_Id = ?";
        try (PreparedStatement statement = connection.getConnection().prepareStatement(sql)) {
            statement.setInt(1, salary);
            statement.setInt(2, id);

            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("Employee salary updated for ID: " + id);
            } else {
                System.out.println("Operation failed. Employee ID not found: " + id);
            }
        }
    }

    // Delete employee by ID
    public void deleteEmployeeById(int id) throws SQLException {
        String sql = "DELETE FROM employee_data WHERE emp_Id = ?";
        try (PreparedStatement statement = connection.getConnection().prepareStatement(sql)) {
            statement.setInt(1, id);

            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("Deleted employee with ID: " + id);
            } else {
                System.out.println("Operation failed. Employee ID not found: " + id);
            }
        }
    }

    // Search employee by name
    public void searchEmployeeByName(String name) throws SQLException {
        String sql = "SELECT * FROM employee_data WHERE emp_Name = ?";
        try (PreparedStatement statement = connection.getConnection().prepareStatement(sql)) {
            statement.setString(1, name);

            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Employee emp = new Employee(
                            result.getInt("emp_Id"),
                            result.getString("emp_Name"),
                            result.getString("emp_Department"),
                            result.getInt("emp_Salary")
                    );
                    System.out.println(emp);
                }
            }
        }
    }
}
