package com.cabbygo;

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void showInfo() {
        System.out.println(" Driver Info:");
        System.out.println("   Name: " + name);
        System.out.println("   Rating: " + rating + "*");
    }
}
