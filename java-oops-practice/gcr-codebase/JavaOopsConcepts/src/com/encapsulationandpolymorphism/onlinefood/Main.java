package com.encapsulationandpolymorphism.onlinefood;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();

        VegItem paneer = new VegItem("Paneer Curry", 150, 2);
        NonVegItem chicken = new NonVegItem("Chicken Curry", 200, 1, 50);

        // Apply discounts
        paneer.applyDiscount(10); // 10% discount
        chicken.applyDiscount(5); // 5% discount

        order.add(paneer);
        order.add(chicken);

        // Process order using polymorphism
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println();
        }

        // Calculate total order cost
        double totalOrder = 0;
        for (FoodItem item : order) {
            totalOrder += item.calculateTotalPrice();
        }
        System.out.println("Total Order Amount: " + totalOrder);
    }
}
