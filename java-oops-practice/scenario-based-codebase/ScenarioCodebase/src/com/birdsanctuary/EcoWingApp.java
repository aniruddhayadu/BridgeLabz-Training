package com.birdsanctuary;

public class EcoWingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdSanctuary sanctuary = new BirdSanctuary();

	    // Add birds
		sanctuary.addBird(new Eagle("B101", "Pinku Eagle"));
	    sanctuary.addBird(new Duck("B102", "Mehak"));
	    sanctuary.addBird(new Penguin("B103", "Stranger"));
	    sanctuary.addBird(new Kiwi("B104", "Julion"));

	    System.out.println("\nAll Birds:");
	    sanctuary.displayAllBirds();

	    System.out.println("\nFlying Birds:");
	    sanctuary.displayFlyingBirds();

	    System.out.println("\nSwimming Birds:");
	    sanctuary.displaySwimmingBirds();

	    System.out.println("\nBoth Flying & Swimming Birds:");
	    sanctuary.displayBothFlyAndSwim();

	    System.out.println();
	    sanctuary.sanctuaryReport();
	}

}
