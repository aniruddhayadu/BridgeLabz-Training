package com.cabbygo;

abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;
    protected double ratePerKm; 
    
    
    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public double calculateFare(double baseFare, double distance) {
        return baseFare + (distance * ratePerKm); 
    }

    public void showInfo() {
        System.out.println(" Vehicle Info:");
        System.out.println("   Type: " + type);
        System.out.println("   Number: " + vehicleNumber);
        System.out.println("   Capacity: " + capacity + " passengers");
        System.out.println("   Rate/km: ₹" + ratePerKm);
    }
}
