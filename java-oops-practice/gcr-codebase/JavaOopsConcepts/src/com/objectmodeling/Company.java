package com.objectmodeling;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayCompany() {
        System.out.println("Company Name: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {

        Company company = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee("Amit");
        d1.addEmployee("Neha");

        Department d2 = new Department("HR");
        d2.addEmployee("Rahul");

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.displayCompany();

        // When company object is deleted, departments and employees are also deleted
        company = null;
    }
}
