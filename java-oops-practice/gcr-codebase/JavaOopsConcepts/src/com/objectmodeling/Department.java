package com.objectmodeling;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}
