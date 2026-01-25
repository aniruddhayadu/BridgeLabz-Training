package com.hospitalqueuemangement;

public class HospitalApp {

	public static void main(String[] args) {

		HospitalAVLTree hospital = new HospitalAVLTree();

		// Scenario 1: Patient registration
		hospital.registerPatient(900, "Rahul");
		hospital.registerPatient(830, "Anita");
		hospital.registerPatient(1000, "Suresh");
		hospital.registerPatient(845, "Priya");
		hospital.registerPatient(930, "Karan");

		// Scenario 3: Display patients by arrival time
		hospital.displayQueue();

		// Scenario 2: Discharge patient
		System.out.println("\nDischarging patient at 845");
		hospital.dischargePatient(845);

		hospital.displayQueue();
	}
}
