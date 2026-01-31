package com.medinventory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

// Handles inventory processing
public class InventoryManager {

    // Regex for dd-MM-yyyy date format
    private static final Pattern DATE_PATTERN =
            Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Categorizes items by type
    public static <T> Map<String, List<Item<T>>> categorize(
            Set<Item<T>> items) {

        Map<String, List<Item<T>>> map = new HashMap<>();

        for (Item<T> item : items) {
            map.computeIfAbsent(
                    item.getItemType().toString(),
                    k -> new ArrayList<>()
            ).add(item);
        }

        return map;
    }

    // Checks for expired items
    public static <T> void detectExpiredItems(Set<Item<T>> items) {

        LocalDate today = LocalDate.now();

        for (Item<T> item : items) {

            // Validate expiry date format using regex
            if (!DATE_PATTERN.matcher(item.getExpiryDate()).matches()) {
                System.out.println("Invalid date format: " + item);
                continue;
            }

            LocalDate expiry =
                    LocalDate.parse(item.getExpiryDate(), FORMATTER);

            if (expiry.isBefore(today)) {
                System.out.println("❌ EXPIRED: " + item);
            }
        }
    }

    // Checks for critically low stock
    public static <T> void checkLowStock(
            Set<Item<T>> items, int threshold)
            throws LowStockException {

        for (Item<T> item : items) {
            if (item.getQuantity() < threshold) {
                throw new LowStockException(
                        "⚠ Low stock alert for " + item.getItemName());
            }
        }
    }
}
