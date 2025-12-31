package com.objectmodeling.self;
import java.util.ArrayList;

public class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    Patient(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    // Association: add doctor
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void viewDoctors() {
        System.out.println(name + " consults with:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }
}
