package com.foodloop;

public class FoodItem {
    private int stock; 
    String name;
    String category;
    double price;
    boolean availability;

    FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.availability = stock > 0;
    }

    protected boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        availability = false;
        return false;
    }

    double applyDiscount(double total) {
        return total; 
    }
}
