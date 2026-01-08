package com.tourmate;

public abstract class Trip {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        calculateBudget();
    }

    private void calculateBudget() {
        budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }
    
    public abstract void bookTrip();
}
