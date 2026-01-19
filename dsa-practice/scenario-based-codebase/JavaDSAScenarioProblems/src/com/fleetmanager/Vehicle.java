package com.fleetmanager;

public class Vehicle {
	// Instance of class
	String brand;
	String model;
	int mileage;
	String depot;

	// Parameterized constructor
	public Vehicle(String brand, String model, int mileage, String depot) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.depot = depot;
	}

}