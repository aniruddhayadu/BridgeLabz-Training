package com.streamAPI.filteringexpiringmemberships;
import java.time.LocalDate;

//Gym member model
public class Member {
	private String name;
	private LocalDate expiryDate;

	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return name + " | Expiry: " + expiryDate;
	}
}