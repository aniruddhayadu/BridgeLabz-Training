package com.medistore;
import java.time.LocalDate;
class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(getExpiryDate().minusMonths(10));
    }

}