package com.foodloop;

public class FoodLoopApp {

	public static void main(String[] args) {
        VegItem vegBurger = new VegItem("Veg Burger", 150, 10);
        VegItem paneerPizza = new VegItem("Paneer Pizza", 300, 5);
        NonVegItem chickenBurger = new NonVegItem("Chicken Burger", 200, 8);
        NonVegItem fishFry = new NonVegItem("Fish Fry", 250, 6);

        Order comboOrder = new Order(vegBurger, paneerPizza, chickenBurger);

        comboOrder.placeOrder();

        comboOrder.cancelOrder();
    }
	
}
