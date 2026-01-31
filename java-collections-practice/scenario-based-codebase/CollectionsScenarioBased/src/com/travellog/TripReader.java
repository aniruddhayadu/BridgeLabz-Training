package com.travellog;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

// Handles reading trip objects from file
public class TripReader {

	@SuppressWarnings("unchecked") // Suppresses unchecked cast warning
	public static List<Trip> readTrips(String fileName) throws Exception {

		// Creates stream to read objects from file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

		// Reads object and casts it to List<Trip>
		List<Trip> trips = (List<Trip>) ois.readObject();

		// Closes stream
		ois.close();

		// Returns loaded trips
		return trips;
	}
}