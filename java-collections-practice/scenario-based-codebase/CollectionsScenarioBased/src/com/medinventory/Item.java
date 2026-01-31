package com.medinventory;

import java.util.Objects;

//Generic inventory item
public class Item<T> {

 private String itemId;      // Unique item ID
 private String itemName;    // Item name
 private int quantity;       // Available quantity
 private String expiryDate;  // Expiry date (dd-MM-yyyy)
 private T itemType;         // Type (Medicine, Surgical, etc.)

 public Item(String itemId, String itemName, int quantity,
             String expiryDate, T itemType) {
     this.itemId = itemId;
     this.itemName = itemName;
     this.quantity = quantity;
     this.expiryDate = expiryDate;
     this.itemType = itemType;
 }

 public String getItemId() {
     return itemId;
 }

 public String getItemName() {
     return itemName;
 }

 public int getQuantity() {
     return quantity;
 }

 public String getExpiryDate() {
     return expiryDate;
 }

 public T getItemType() {
     return itemType;
 }

 // Used by Set to remove duplicates based on itemId
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Item<?> item)) return false;
     return itemId.equals(item.itemId);
 }

 @Override
 public int hashCode() {
     return Objects.hash(itemId);
 }

 @Override
 public String toString() {
     return itemName + " (Qty: " + quantity + ", Exp: " + expiryDate + ")";
 }
}
