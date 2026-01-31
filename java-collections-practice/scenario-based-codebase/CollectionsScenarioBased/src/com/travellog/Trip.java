package com.travellog;

import java.io.Serializable;

//Trip class represents one travel entry
public class Trip implements Serializable {

	// Ensures class compatibility during serialization
	private static final long serialVersionUID = 1L;

	private String city; // City visited
	private String country; // Country visited
	private int durationInDays; // Trip duration
	private String notes; // Travel notes

	// Parameterized constructor to initialize trip data
	public Trip(String city, String country, int durationInDays, String notes) {
		this.city = city;
		this.country = country;
		this.durationInDays = durationInDays;
		this.notes = notes;
	}

	// Returns city name
	public String getCity() {
		return city;
	}

	// Returns country name
	public String getCountry() {
		return country;
	}

	// Returns trip duration
	public int getDurationInDays() {
		return durationInDays;
	}

	// Returns notes
	public String getNotes() {
		return notes;
	}

	// Converts object data into readable string
	@Override
	public String toString() {
		return city + ", " + country + " (" + durationInDays + " days)";
	}
}