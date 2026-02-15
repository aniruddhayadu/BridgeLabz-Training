package com.employeemanagementsystem;

import java.sql.SQLException;

public class EmployeeMain {

    public static void main(String[] args) {
        try {
            EmployeeManagement management = new EmployeeManagement();

            // Add employees
            management.addEmployee(new Employee("Sampth", "CORE", 79999));
            management.addEmployee(new Employee("Ravi", "HR", 4433333));
            management.addEmployee(new Employee("Surya", "MBA", 89999));
            management.addEmployee(new Employee("Sonu", "MCA", 35532));
            management.addEmployee(new Employee("Alice", "Pharma", 65699));
            management.addEmployee(new Employee("Adam", "Hardware", 99990));

            // Update salary
            management.updateEmployeeSalary(1, 88888888);

            // Delete employee by ID
            management.deleteEmployeeById(2);

            // Add another employee
            management.addEmployee(new Employee("Ravi", "Electronics", 555555));

            // Search employee by name
            management.searchEmployeeByName("Ravi");

            // View all employees
            management.viewAllEmployees();

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
