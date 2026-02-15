package com.employeemanagementsystem;

public class Employee {

    private int empId;
    private String employeeName;
    private String department;
    private int salary;

    // Constructor for creating new employee (without ID)
    public Employee(String employeeName, String department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    // Constructor with ID (for fetching from DB)
    public Employee(int empId, String employeeName, String department, int salary) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
