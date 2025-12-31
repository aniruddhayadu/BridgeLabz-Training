package com.objectmodeling.self;

import java.util.ArrayList;

public class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    String getName() {
        return name;
    }

    // Association: consult a patient
    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println(name + " consulted with " + patient.getName());
    }

    void viewPatients() {
        System.out.println(name + " has consulted with:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

