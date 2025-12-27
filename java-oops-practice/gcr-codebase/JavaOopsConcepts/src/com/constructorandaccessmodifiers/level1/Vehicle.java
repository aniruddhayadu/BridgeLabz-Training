package com.constructorandaccessmodifiers.level1;

public class Vehicle {

	String ownerName;
	String vehicleType;
	static int registrationFee;
	Vehicle (String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		registrationFee = 200;
	}
	
	void displayVehicleDetails() {
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration Fee: " + registrationFee);
	}
	static void updateRegistrationFee(int updatedFee) {
		registrationFee = updatedFee;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = new Vehicle("Anni","4 wheeler");
		Vehicle vehicle2 = new Vehicle("Princi","2 wheeler");
		vehicle1.displayVehicleDetails();
		Vehicle.updateRegistrationFee(150);
		vehicle2.displayVehicleDetails();
	}

}
