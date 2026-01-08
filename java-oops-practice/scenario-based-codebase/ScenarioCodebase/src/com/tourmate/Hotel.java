package com.tourmate;

public class Hotel implements IBookable {

    private double costPerDay;
    private int days;

    public Hotel(double costPerDay, int days) {
        this.costPerDay = costPerDay;
        this.days = days;
    }

    public double getCost() {
        return costPerDay * days;
    }

    public void book() {
        System.out.println("Hotel booked for " + days + " days");
    }

    public void cancel() {
        System.out.println("Hotel booking cancelled");
    }
}
