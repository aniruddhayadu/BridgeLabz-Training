package com.objectmodeling.self;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Aggregation: add product to order
    void addProduct(Product product) {
        products.add(product);
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }
}
