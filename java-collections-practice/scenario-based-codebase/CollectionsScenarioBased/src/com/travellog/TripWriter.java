package com.travellog;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

// Handles writing trip objects to file
public class TripWriter {

	public static void writeTrips(List<Trip> trips, String fileName) throws Exception {

		// Creates stream to write objects to file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));

		// Writes entire list of trips to file
		oos.writeObject(trips);

		// Closes the stream
		oos.close();
	}
}