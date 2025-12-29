package com.constructorandaccessmodifiers.level1;

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);       // public
        System.out.println("Department: " + department);       // protected
        System.out.println("Salary: " + getSalary());          // private via getter
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(201, "IT", 75000.0);
        mgr.displayDetails();

        // Update salary using setter
        mgr.setSalary(85000.0);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}