package com.encapsulationandpolymorphism.ecommerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Electronics laptop = new Electronics(1, "Laptop", 1000, 10, 15); // 10% discount, 15% tax
        Clothing tshirt = new Clothing(2, "T-Shirt", 50, 5, 10);          // 5% discount, 10% tax
        Groceries apple = new Groceries(3, "Apple", 2, 0.5);              // $0.5 discount

        products.add(laptop);
        products.add(tshirt);
        products.add(apple);

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}

