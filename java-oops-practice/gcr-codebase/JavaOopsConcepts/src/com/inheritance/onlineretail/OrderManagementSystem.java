package com.inheritance.onlineretail;

public class OrderManagementSystem {
    public static void main(String[] args) {

        Order order = new Order("ORD001", "2024-10-01");
        Order shippedOrder = new ShippedOrder("ORD002", "2024-10-02", "TRK12345");
        Order deliveredOrder = new DeliveredOrder(
                "ORD003", "2024-10-03", "TRK67890", "2024-10-05"
        );

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
