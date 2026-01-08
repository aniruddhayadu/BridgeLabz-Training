package com.tourmate;

public class Activity implements IBookable {

    private double cost;

    public Activity(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void book() {
        System.out.println("Activity booked");
    }

    public void cancel() {
        System.out.println("Activity booking cancelled");
    }
}