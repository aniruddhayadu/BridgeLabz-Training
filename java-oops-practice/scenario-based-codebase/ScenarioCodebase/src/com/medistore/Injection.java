package com.medistore;
import java.time.LocalDate;
public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    public boolean checkExpiry() {
        return LocalDate.now().isAfter(getExpiryDate().minusMonths(15));
    }

}
