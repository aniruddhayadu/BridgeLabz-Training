package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,
                          int attendees, User organizer) {
        super(name, location, date, attendees, organizer);
    }

    public BirthdayEvent(String name, String location, String date,
                          int attendees, User organizer,
                          double serviceCost, double discount) {
        super(name, location, date, attendees, organizer, serviceCost, discount);
    }

    public void schedule() {
        System.out.println(" Birthday Event Scheduled with decorations & music!");
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(" Birthday Event rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println(" Birthday Event has been cancelled.");
    }
}
