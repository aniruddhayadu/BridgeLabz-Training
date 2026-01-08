package com.tourmate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    public void bookTrip() {
        System.out.println("Booking Domestic Trip to " + destination);
        transport.book();
        hotel.book();
        activity.book();
        System.out.println("Total Budget: " + budget);
    }
}

