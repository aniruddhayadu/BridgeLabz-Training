package com.encapsulationandpolymorphism.onlinefood;

public class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double extraCharge; // e.g., for meat/fish

    public NonVegItem(String itemName, double price, int quantity, double extraCharge) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        total -= total * discount / 100; // apply discount
        return total;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discount + "%, Extra Charge per Unit: " + extraCharge;
    }
}

