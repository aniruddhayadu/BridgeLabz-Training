package com.encapsulationandpolymorphism.employeemanagement;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // For full-time, just return base salary
        return getBaseSalary();
    }
}
