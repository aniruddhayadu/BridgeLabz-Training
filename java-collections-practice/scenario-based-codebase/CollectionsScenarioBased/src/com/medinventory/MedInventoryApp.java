package com.medinventory;

import java.util.*;

//Main application
public class MedInventoryApp {

 public static void main(String[] args) {

     // Read inventory as Medicine type
     Set<Item<String>> inventory =
             InventoryReader.readInventory(
                     "inventory.csv", "Medicine");

     // Detect expired items
     InventoryManager.detectExpiredItems(inventory);

     // Categorize inventory
     Map<String, List<Item<String>>> categorized =
             InventoryManager.categorize(inventory);

     System.out.println("\n--- Inventory Categories ---");
     categorized.forEach((k, v) ->
             System.out.println(k + " : " + v.size() + " items"));

     // Check low stock condition
     try {
         InventoryManager.checkLowStock(inventory, 10);
     } catch (LowStockException e) {
         System.out.println(e.getMessage());
     }
 }
}
