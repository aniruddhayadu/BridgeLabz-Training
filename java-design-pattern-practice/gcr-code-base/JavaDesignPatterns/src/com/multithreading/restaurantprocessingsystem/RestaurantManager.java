package com.multithreading.restaurantprocessingsystem;

public class RestaurantManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chef chef1 = new Chef("Divyanshu", "Pizza", 1000);
		Chef chef2 = new Chef("Nikki", "Pasta", 2000);
		Chef chef3 = new Chef("Chetna", "Salad", 1000);
		Chef chef4 = new Chef("Shivani", "Burger", 1000);
		
		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();
		
		try {
            chef1.join();
            chef2.join();
            chef3.join();
            chef4.join();
        }
		catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println("Kitchen closed - All orders completed");
	}

}
