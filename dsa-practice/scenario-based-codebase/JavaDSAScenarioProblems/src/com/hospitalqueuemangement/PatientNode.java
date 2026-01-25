package com.hospitalqueuemangement;

public class PatientNode {

	int checkInTime; // patient arrival time
	String patientName; // patient name
	int height; // height for AVL balancing

	PatientNode left; // left child
	PatientNode right; // right child

	// Constructor
	PatientNode(int checkInTime, String patientName) {
		this.checkInTime = checkInTime;
		this.patientName = patientName;
		this.height = 1;
	}
}
