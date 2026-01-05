package com.swiftcart;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        // Operator usage: price * quantity
        totalPrice += product.getPrice() * quantity;
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    public void applyDiscount(double couponAmount) {
        double discountedTotal = 0;

        for (Product p : products) {
            discountedTotal += p.applyDiscount(p.getPrice());
        }
        
        totalPrice = discountedTotal - couponAmount;
    }

    public void generateBill() {
        System.out.println(" SwiftCart Bill ");
        for (Product p : products) {
            System.out.println(p.getName() + " - " + p.getCategory());
        }
        System.out.println("Total Price -" + totalPrice);
    }
}
