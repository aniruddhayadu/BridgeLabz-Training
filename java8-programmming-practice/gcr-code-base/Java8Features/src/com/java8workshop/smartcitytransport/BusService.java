package com.java8workshop.smartcitytransport;

public class BusService extends Transport implements TransportService{
	

	public BusService(String route, double fare, int departureTime) {
		super(route, fare, departureTime);
	}

	@Override
	public String getServiceName() {
		return "BUS";
	}
}
