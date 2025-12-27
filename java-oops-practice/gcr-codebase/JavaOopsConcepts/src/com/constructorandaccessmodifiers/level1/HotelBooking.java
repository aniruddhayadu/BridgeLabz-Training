package com.constructorandaccessmodifiers.level1;

public class HotelBooking {

	 // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Alice";
        roomType = "Double";
        nights = 3;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking previousBooking) {
    	this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }


    // Display Booking Details
    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Default Constructor
		HotelBooking booking1 = new HotelBooking();
        System.out.println("booking 1:");
        booking1.displayBookingDetails();

        // Parameterized Constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Latte", 3);
        System.out.println("\nbooking 2:");
        booking2.displayBookingDetails();

        // Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nOrder 3 (Copy of booking 2):");
        booking3.displayBookingDetails();

	}

}
