package com.java8workshop.smartcitytransport;

@FunctionalInterface
public interface FareCalculator {
	double calculateFare(double distance);
}
