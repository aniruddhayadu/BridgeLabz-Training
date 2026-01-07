package com.bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    public double applyDiscount(int quantity) {
        return (price * quantity) * 0.10;
    }
}
