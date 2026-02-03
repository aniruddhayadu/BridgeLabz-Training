package com.java8workshop.smartcitytransport;

public class MetroService extends Transport implements TransportService{

	public MetroService(String route, double fare, int departureTime) {
		super(route, fare, departureTime);
	}

	@Override
	public String getServiceName() {
		return "Metro";
	}
}
