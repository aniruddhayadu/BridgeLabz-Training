package com.foodloop;

public class NonVegItem extends FoodItem {
    NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    double applyDiscount(double total) {
        if (total > 800) return total * 0.85;
        return total;
    }
}
