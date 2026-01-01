package com.inheritance.restaurantmanagement;

public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Worker chef = new Chef("Gordon", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Alice", 102, 5);

        chef.performDuties();
        waiter.performDuties();

        // Optional: Display Person info
        System.out.println();
        ((Person) chef).displayInfo();
        ((Person) waiter).displayInfo();
    }
}
