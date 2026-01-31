package com.travellog;

import java.util.*;

//Main application class
public class TravelLogApp {

	public static void main(String[] args) throws Exception {

		// Creates sample trip data
		List<Trip> trips = Arrays.asList(new Trip("Paris", "France", 7, "Eiffel tower and cafes"),
				new Trip("Rome", "Italy", 4, "Colosseum visit"), new Trip("Paris", "France", 6, "Art museums"),
				new Trip("Berlin", "Germany", 8, "History tour"), new Trip("Rome", "Italy", 9, "Food exploration"));

		// File name to store serialized data
		String file = "trips.dat";

		// Writes trips to file
		TripWriter.writeTrips(trips, file);

		// Reads trips from file
		List<Trip> loadedTrips = TripReader.readTrips(file);

		// Regex based city search
		System.out.println("Regex Search (paris):");
		TravelLogAnalyzer.searchCitiesUsingRegex(loadedTrips, "paris");

		// Trips longer than 5 days
		System.out.println("\nTrips > 5 days:");
		TravelLogAnalyzer.tripsLongerThan5Days(loadedTrips);

		// Displays unique countries
		System.out.println("\nUnique Countries:");
		System.out.println(TravelLogAnalyzer.uniqueCountries(loadedTrips));

		// Displays top 3 cities
		System.out.println("\nTop 3 Cities:");
		TravelLogAnalyzer.top3Cities(loadedTrips);
	}
}