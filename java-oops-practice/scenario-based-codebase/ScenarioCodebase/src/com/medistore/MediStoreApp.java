package com.medistore;

import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        // Creating medicine objects
        Medicine tablet = new Tablet(
                "Paracetamol",
                5.0,
                LocalDate.of(2026, 3, 15)
        );

        Medicine syrup = new Syrup(
                "Cough Syrup",
                120.0,
                LocalDate.of(2025, 12, 10)
        );

        Medicine injection = new Injection(
                "Insulin",
                250.0,
                LocalDate.of(2025, 8, 20)
        );

        // Selling medicines
        double bill1 = tablet.sell(20);
        System.out.println("Tablet Bill Amount: " + bill1);

        double bill2 = syrup.sell(3);
        System.out.println("Syrup Bill Amount: " + bill2);

        double bill3 = injection.sell(2);
        System.out.println("Injection Bill Amount: " + bill3);
    }
}
