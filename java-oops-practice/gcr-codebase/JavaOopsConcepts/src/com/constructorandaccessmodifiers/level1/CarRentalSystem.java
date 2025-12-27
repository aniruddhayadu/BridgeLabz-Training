package com.constructorandaccessmodifiers.level1;

public class CarRentalSystem {

	// Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Parameterized Constructor
    CarRentalSystem (String customerName, String carModel, int  rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

	// Method to calculate price
    private double calculateCost() {
        double costPerHour = switch (carModel.toLowerCase()) {
            case "volvo" -> 550;
            case "thar" -> 460;
            case "swift" -> 405;
            default -> 300; // Regular 
        };
        return costPerHour *  rentalDays;
    }

    // Display Order Details
    void displayOrderDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Type: " + carModel);
        System.out.println(":rental Days " + rentalDays);
        System.out.println("Total Price: $" + totalCost);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRentalSystem car1 = new CarRentalSystem("Abhi", "volvo", 5);
		car1.calculateCost();
		car1.displayOrderDetails();
	}

}
