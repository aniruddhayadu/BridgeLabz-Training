package com.objectmodeling.self;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor doc1 = new Doctor("Dr. Smith");
        Doctor doc2 = new Doctor("Dr. Jones");

        Patient pat1 = new Patient("Alice");
        Patient pat2 = new Patient("Bob");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        // Consultations (association + communication)
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat1);

        System.out.println();
        hospital.displayHospital();
        System.out.println();
        doc1.viewPatients();
        System.out.println();
        pat1.viewDoctors();
    }
}

