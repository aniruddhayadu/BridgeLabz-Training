package com.swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    public double applyDiscount(double price) {
        // 10% discount on perishable items
        return price * 0.90;
    }
}
