package com.objectmodeling.self;

public class ECommercePlatform {
    public static void main(String[] args) {

        // Products
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Mouse", 25);
        Product p3 = new Product("Keyboard", 45);

        // Orders
        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p2);
        o2.addProduct(p3);

        // Customer
        Customer customer = new Customer("Alice");

        // Customer places orders (communication)
        customer.placeOrder(o1);
        customer.placeOrder(o2);

        // Display customer orders
        customer.viewOrders();
    }
}
