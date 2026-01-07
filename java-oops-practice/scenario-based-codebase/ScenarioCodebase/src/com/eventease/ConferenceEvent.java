package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date,
                            int attendees, User organizer) {
        super(name, location, date, attendees, organizer);
    }

    public ConferenceEvent(String name, String location, String date,
                            int attendees, User organizer,
                            double serviceCost, double discount) {
        super(name, location, date, attendees, organizer, serviceCost, discount);
    }

    public void schedule() {
        System.out.println(" Conference Scheduled with AV setup & catering.");
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(" Conference rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println(" Conference Event has been cancelled.");
    }
}