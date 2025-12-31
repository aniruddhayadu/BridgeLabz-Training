package com.objectmodeling.self;

public class Product {
    private String productName;
    private double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    double getPrice() {
        return price;
    }
}
