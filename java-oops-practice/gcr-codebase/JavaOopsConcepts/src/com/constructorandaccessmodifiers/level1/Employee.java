package com.constructorandaccessmodifiers.level1;

public class Employee {

    public int employeeID;         // public
    protected String department;   // protected
    private double salary;         // private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }
}