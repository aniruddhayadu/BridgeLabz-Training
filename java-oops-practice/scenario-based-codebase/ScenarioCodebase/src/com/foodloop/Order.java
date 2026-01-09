package com.foodloop;
import java.util.*;
public class Order implements IOrderable {
    List<FoodItem> items = new ArrayList<>();
    double total;

    Order(FoodItem... foodItems) {
        for (FoodItem item : foodItems) {
            if (item.reduceStock()) {
                items.add(item);
                total += item.price;
            }
        }
    }
    void calculateTotal() {
        for (FoodItem item : items) {
            total = item.applyDiscount(total);
        }
    }

    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed. Total: " + total);
    }

    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}
