 package com.bookbazaar;

public class Order {

    private String userName;
    private Book book;
    private int quantity;
    private boolean orderCompleted;   // restricted access

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
    }

    // Total Cost Calculation:
    // price × quantity – discount
    public double calculateTotalCost() {
        double totalPrice = book.getPrice() * quantity;
        double discount = book.applyDiscount(quantity);
        return totalPrice - discount;
    }

    // Order status change allowed internally only
    protected void completeOrder() {
        this.orderCompleted = true;
    }

    public boolean placeOrder() {
        if (book.reduceStock(quantity)) {
            completeOrder();
            return true;
        }
        return false;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }
}

