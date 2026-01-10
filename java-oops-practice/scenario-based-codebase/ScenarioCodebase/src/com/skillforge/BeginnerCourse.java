package com.skillforge;

import java.util.List;

class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    // ADD THIS CONSTRUCTOR
    public BeginnerCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    protected void printCertificateFormat() {
        System.out.println("Beginner Level Certificate");
    }
}
