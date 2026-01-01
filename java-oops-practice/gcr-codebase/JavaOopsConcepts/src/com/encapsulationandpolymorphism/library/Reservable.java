package com.encapsulationandpolymorphism.library;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
