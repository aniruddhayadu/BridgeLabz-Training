package com.onlineticketbooking;

public class TicketBookingApp {

	public static void main(String[] args) {

		EventAVLTree bookingSystem = new EventAVLTree();

		// Scenario 1: Insert events
		bookingSystem.insertEvent(1800, "Music Concert");
		bookingSystem.insertEvent(1000, "Tech Conference");
		bookingSystem.insertEvent(1500, "Movie Premiere");
		bookingSystem.insertEvent(1200, "Startup Meetup");
		bookingSystem.insertEvent(2000, "Standup Comedy");

		// Scenario 3: Show events in order
		bookingSystem.showEvents();

		// Scenario 2: Cancel an event
		System.out.println("\nCancelling event at 1500");
		bookingSystem.cancelEvent(1500);

		bookingSystem.showEvents();
	}
}
