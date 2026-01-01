package com.encapsulationandpolymorphism.library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        Book book = new Book("B101", "Java Programming", "Author A");
        Magazine magazine = new Magazine("M202", "Tech Monthly", "Author B");
        DVD dvd = new DVD("D303", "Inception", "Director C");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Display details for all items
        for (LibraryItem item : items) {
            item.getItemDetails();
            if (item instanceof Reservable) {
                System.out.println("Available: " + ((Reservable) item).checkAvailability());
            }
            System.out.println();
        }

        // Reserve some items
        book.reserveItem("Alice");
        dvd.reserveItem("Bob");

        System.out.println();

        // Check availability again
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + " available: " + ((Reservable) item).checkAvailability());
        }
    }
}
