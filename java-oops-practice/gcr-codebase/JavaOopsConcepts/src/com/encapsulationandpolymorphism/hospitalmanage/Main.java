package com.encapsulationandpolymorphism.hospitalmanage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("IP101", "Alice", 30, 5, 2000);
        OutPatient outPatient = new OutPatient("OP202", "Bob", 25, 500, 3);

        // Add medical records
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-surgery recovery");
        outPatient.addRecord("Consultation for fever");
        outPatient.addRecord("Follow-up visit");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println();
        }
    }
}
