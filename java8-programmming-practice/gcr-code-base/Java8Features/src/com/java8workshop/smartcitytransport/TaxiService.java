package com.java8workshop.smartcitytransport;

public class TaxiService extends Transport implements TransportService{

	public TaxiService(String route, double fare, int departureTime) {
		super(route, fare, departureTime);
	}

	@Override
	public String getServiceName() {
		return "Taxi";
	}
}
