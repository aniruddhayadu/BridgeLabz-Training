
package com.tourmate;

public class TourMateApp {

    public static void main(String[] args) {

        Transport transport = new Transport(8000);
        Hotel hotel = new Hotel(2000, 5);
        Activity activity = new Activity(3000);

        Trip domesticTrip = new DomesticTrip(
                "Goa", 5, transport, hotel, activity
        );

        domesticTrip.bookTrip();

        System.out.println();

        Trip internationalTrip = new InternationalTrip(
                "Paris", 7,
                new Transport(45000),
                new Hotel(6000, 7),
                new Activity(10000)
        );

        internationalTrip.bookTrip();
    }
}

