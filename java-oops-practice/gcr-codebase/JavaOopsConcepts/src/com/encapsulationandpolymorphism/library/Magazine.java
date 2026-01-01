package com.encapsulationandpolymorphism.library;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;
    private String borrowerName;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println(getTitle() + " has been reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public String getBorrowerName() {
        return borrowerName;
    }
}
