package com.artify;

public abstract class Artwork {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    public void purchase(User buyer) {
        if (buyer.deductAmount(price)) {
            System.out.println(buyer.getName() + " purchased \"" + title + "\" for $" + price);
        } else {
            System.out.println("Insufficient balance to purchase " + title);
        }
    }

    public abstract void license();
}
