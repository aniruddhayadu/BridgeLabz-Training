package com.multithreading.restaurantprocessingsystem;

public class Chef extends Thread {

    private String dish;
    private int cookingTime; 

    public Chef(String name, String dish, int cookingTime) {
        super(name);
        this.dish = dish;
        this.cookingTime = cookingTime;
    }


    public void run() {
        System.out.println(getName() + " started preparing " + dish);

        int steps = 4;
        int sleepTime = cookingTime / steps;

        for (int i = 1; i <= steps; i++) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " preparing " + dish + ": " + (i * 25) + "% complete");
        }
    }
}
