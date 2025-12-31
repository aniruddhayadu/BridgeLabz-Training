package com.objectmodeling.self;
import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department> departments; // Composition: University owns Departments
    private ArrayList<Faculty> faculties;      // Aggregation: Faculties exist independently

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition: add department (University owns Department)
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: add faculty (Faculty exists independently)
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }

    public static void main(String[] args) {
        // Faculties exist independently
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");

        // University and Departments (composition)
        University uni = new University("Global University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        // Add faculties (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Display
        uni.displayUniversity();

        // Deleting university also deletes its departments (composition)
        uni = null;

        // Faculties still exist
        System.out.println("\nFaculty members still exist independently:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}
