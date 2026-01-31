package com.medinventory;

import java.io.*;
import java.util.*;

// Reads inventory CSV files
public class InventoryReader {

    // Reads inventory data from CSV
    public static <T> Set<Item<T>> readInventory(
            String csvFile, T itemType) {

        Set<Item<T>> items = new HashSet<>(); // Removes duplicates

        try (BufferedReader br =
                     new BufferedReader(new FileReader(csvFile))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Skip header line
                if (line.startsWith("ItemID")) continue;

                String[] parts = line.split(",");

                // Skip malformed lines
                if (parts.length != 4) continue;

                Item<T> item = new Item<>(
                        parts[0],
                        parts[1],
                        Integer.parseInt(parts[2]),
                        parts[3],
                        itemType
                );

                items.add(item);
            }

        } catch (Exception e) {
            System.out.println("Error reading inventory: " + e.getMessage());
        }

        return items;
    }
}