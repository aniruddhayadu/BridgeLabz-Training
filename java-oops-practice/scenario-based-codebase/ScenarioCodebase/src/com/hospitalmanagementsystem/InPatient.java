package com.hospitalmanagementsystem;

public class InPatient extends Patient {
	private int numberOfDays;
	public InPatient (int id, String name, int age, int days) {
		super(id, name, age);
		this.numberOfDays = days;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Admitted Days: " + numberOfDays);
	}
}
