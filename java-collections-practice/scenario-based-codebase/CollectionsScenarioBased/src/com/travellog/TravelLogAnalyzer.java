package com.travellog;

import java.util.*;
import java.util.regex.*;

// Contains logic for analyzing travel data
public class TravelLogAnalyzer {

	// Searches trips using regex on city and notes
	public static void searchCitiesUsingRegex(List<Trip> trips, String regex) {

		// Compiles regex pattern (case insensitive)
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// Iterates through all trips
		for (Trip trip : trips) {

			// Matches regex against city + notes text
			Matcher matcher = pattern.matcher(trip.getCity() + " " + trip.getNotes());

			// If match found, print trip
			if (matcher.find()) {
				System.out.println(trip);
			}
		}
	}

	// Displays trips longer than 5 days
	public static void tripsLongerThan5Days(List<Trip> trips) {

		// Filters trips having duration more than 5 days
		trips.stream().filter(t -> t.getDurationInDays() > 5).forEach(System.out::println);
	}

	// Returns unique countries visited
	public static Set<String> uniqueCountries(List<Trip> trips) {

		// HashSet avoids duplicate countries
		Set<String> countries = new HashSet<>();

		// Adds country from each trip
		for (Trip trip : trips) {
			countries.add(trip.getCountry());
		}

		// Returns unique country set
		return countries;
	}

	// Displays top 3 most visited cities
	public static void top3Cities(List<Trip> trips) {

		// Map to store city visit count
		Map<String, Integer> cityCount = new HashMap<>();

		// Counts visits for each city
		for (Trip trip : trips) {
			cityCount.put(trip.getCity(), cityCount.getOrDefault(trip.getCity(), 0) + 1);
		}

		// Sorts cities by visit count and prints top 3
		cityCount.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(3)
				.forEach(e -> System.out.println(e.getKey() + " → " + e.getValue() + " visits"));
	}
}