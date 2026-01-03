package com.cabbygo;

class RideService implements IRideService {
    private double fare; // sensitive
    private boolean rideActive;

    private static final double BASE_FARE = 50.0;

    
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        fare = vehicle.calculateFare(BASE_FARE, distance);
        rideActive = true;

        System.out.println("\n Ride Booking Confirmed! ");
        driver.showInfo();
        vehicle.showInfo();
        System.out.println(" Distance: " + distance + " km");
        System.out.println(" Estimated Fare: ₹" + fare);
        System.out.println(" Enjoy your ride!\n");
    }

    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println(" Ride Completed Successfully!");
            System.out.println(" Total Fare: ₹" + fare);
            System.out.println(" Thank you for riding with CabbyGo!\n");
        } else {
            System.out.println(" No active ride to end.\n");
        }
    }
}

