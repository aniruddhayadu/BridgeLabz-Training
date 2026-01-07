package com.parkease;

public class ParkEase {

    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot(1, "Zone A", "Car");
        Vehicle car = new Car("CAR-101");

        if (slot1.parkVehicle(car)) {
            int duration = 6; 
            double charges = car.calculateCharges(duration);

            System.out.println("Parking Successful");
            System.out.println("Charges: " + charges);
            System.out.println("Log: " + slot1.getBookingLog());

            slot1.releaseSlot();
        } else {
            System.out.println("Parking Failed");
        }
    }
}
