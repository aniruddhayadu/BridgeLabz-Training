package com.objectmodeling.self;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;

    Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    // Communication: place an order
    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    void viewOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.displayOrder();
            System.out.println("------------");
        }
    }
}
