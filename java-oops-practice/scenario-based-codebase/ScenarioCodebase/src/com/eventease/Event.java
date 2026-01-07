package com.eventease;
import java.util.UUID;
public abstract class Event implements ISchedulable {

    private final String eventId; 
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    private double venueCost;
    private double serviceCost;
    private double discount;

    public Event(String eventName, String location, String date, int attendees, User organizer) {
        this.eventId = UUID.randomUUID().toString();
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = 5000;
        this.serviceCost = 0;
        this.discount = 0;
    }

    public Event(String eventName, String location, String date, int attendees,
                 User organizer, double serviceCost, double discount) {
        this(eventName, location, date, attendees, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public void showEventDetails() {
        System.out.println("\n Event Details \n");
        System.out.println("Event ID   : " + eventId);
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Attendees  : " + attendees);
        organizer.displayOrganizer();
        System.out.println("Total Cost : " + calculateTotalCost());
    }
}