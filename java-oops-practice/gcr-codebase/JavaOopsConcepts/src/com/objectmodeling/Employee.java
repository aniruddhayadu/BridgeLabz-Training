package com.objectmodeling;

public class Employee {
    private String empName;

    Employee(String empName) {
        this.empName = empName;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
    }
}
