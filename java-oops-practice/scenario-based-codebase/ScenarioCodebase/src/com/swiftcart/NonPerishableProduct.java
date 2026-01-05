package com.swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    public double applyDiscount(double price) {
        // 5% discount on non-perishable items
        return price * 0.95;
    }
}
