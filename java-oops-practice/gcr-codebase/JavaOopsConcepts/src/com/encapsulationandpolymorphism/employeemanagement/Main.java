package com.encapsulationandpolymorphism.employeemanagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 5000);
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 20, 80);

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}
