package com.tourmate;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    public void bookTrip() {
        System.out.println("Booking International Trip to " + destination);
        transport.book();
        hotel.book();
        activity.book();
        System.out.println("Passport & Visa verified.");
        System.out.println("Total Budget: " + budget);
    }
}

