package com.vehiclerentalapplication;

public class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        double cost = vehicle.calculateRent(days);
        System.out.println(name + " rented " + vehicle.getBrand() +
                " for " + days + " days. Total Cost: ₹" + cost);
    }
}
