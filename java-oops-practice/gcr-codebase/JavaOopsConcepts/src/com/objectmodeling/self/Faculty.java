package com.objectmodeling.self;

public class Faculty {
    private String name;

    Faculty(String name) {
        this.name = name;
    }

    void displayFaculty() {
        System.out.println("Faculty Name: " + name);
    }

    String getName() {
        return name;
    }
}
