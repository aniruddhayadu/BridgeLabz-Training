/*Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker {

    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int totalDistance = 0;
        	int distanceBetweenStops = 5;

        	while (true) {
            		totalDistance += distanceBetweenStops;
            		System.out.println("You are at a stop. Total distance: " + totalDistance + " km.");
            		System.out.print("Do you want to get off? (true/false): ");
            		boolean exit = sc.nextBoolean();

            	if (exit) {
                	System.out.println("Thank you for riding! Total distance traveled: " + totalDistance + " km.");
                	break;
            	}
        	}

        	sc.close();
    	}
}
