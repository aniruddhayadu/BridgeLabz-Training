package com.swiftcart;

public abstract class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    protected double getPrice() { 
        return price;
    }

    public String getCategory() {
        return category;
    }


    public abstract double applyDiscount(double price);
}
