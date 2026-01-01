package com.encapsulationandpolymorphism.onlinefood;

public interface Discountable {
    void applyDiscount(double discountRate); // discountRate in percentage
    String getDiscountDetails();
}

