package com.eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        System.out.println("✨ Welcome to EventEase – Smart Event Management ✨");

        User organizer1 = new User("Aarav Sharma", "aarav@gmail.com", "1234567897");
        User organizer2 = new User("Neha Kapoor", "neha@gmail.com", "9874561235");

        Event birthday = new BirthdayEvent(
                "Riya's Birthday Bash",
                "Grand Palace",
                "20-Aug-2026",
                80,
                organizer1,
                3000,
                500
        );

        Event conference = new ConferenceEvent(
                "Tech Innovators Conference",
                "City Convention Hall",
                "10-Sep-2026",
                300,
                organizer2,
                12000,
                2000
        );

        birthday.schedule();
        birthday.showEventDetails();

        conference.schedule();
        conference.reschedule("12-Sep-2026");
        conference.showEventDetails();

        System.out.println("\n Thank you for choosing EventEase ");
    }
}

