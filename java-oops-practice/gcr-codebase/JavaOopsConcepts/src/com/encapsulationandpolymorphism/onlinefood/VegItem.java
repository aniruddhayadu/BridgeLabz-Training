package com.encapsulationandpolymorphism.onlinefood;

public class VegItem extends FoodItem implements Discountable {
    private double discount; // in percentage

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total -= total * discount / 100; // apply discount if any
        return total;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + "%";
    }
}

