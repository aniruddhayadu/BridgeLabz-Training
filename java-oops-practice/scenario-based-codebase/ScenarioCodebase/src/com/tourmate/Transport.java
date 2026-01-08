package com.tourmate;

public class Transport implements IBookable {

    private double cost;

    public Transport(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void book() {
        System.out.println("Transport booked.");
    }

    public void cancel() {
        System.out.println("Transport booking cancelled");
    }
}
