package com.medistore;

import java.time.LocalDate;
public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected void adjustStock(int units) {
        quantity -= units;
    }

    protected int getQuantity() {
        return quantity;
    }
    protected LocalDate getExpiryDate() {
        return expiryDate;
    }


    private double applyDiscount(double total) {
        if (total > 500) {
            return total * 0.9; // 10% discount
        }
        return total;
    }
    
    public double sell(int units) {
        if (units <= 0 || units > quantity || checkExpiry()) {
            return 0;
        }

        double totalPrice = price * units;
        totalPrice = applyDiscount(totalPrice);
        adjustStock(units);

        return totalPrice;
    }
}