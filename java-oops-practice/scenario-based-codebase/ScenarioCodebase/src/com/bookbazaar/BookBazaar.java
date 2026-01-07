package com.bookbazaar;

public class BookBazaar {
    public static void main(String[] args) {

        Book book1 = new PrintedBook(
                "Godan",
                "Munshi Premchandra",
                500,
                10
        );

        Book book2 = new EBook(
                "Gunaho ka Devta",
                "Dharmvir Bharti",
                400,
                50
        );

        Order order1 = new Order("Anni", book1, 2);
        Order order2 = new Order("Princi", book2, 1);

        if (order1.placeOrder()) {
            System.out.println("Printed Book Order Placed ");
            System.out.println("Total Cost: rs" + order1.calculateTotalCost());
        } else {
            System.out.println("Printed Book Out of Stock ");
        }

        if (order2.placeOrder()) {
            System.out.println("EBook Order Placed ");
            System.out.println("Total Cost: " + order2.calculateTotalCost());
        } else {
            System.out.println("EBook Out of Stock ");
        }
    }
}