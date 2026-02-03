package com.java8workshop.smartcitytransport;

public class AmbulanceService implements TransportService, EmergencyService{

	@Override
	public String getServiceName() {
		return "Ambulance";
	}

	@Override
	public String getRoute() {
		return "Emergency Routes";
	}

	@Override
	public double getFare() {
		return 0;
	}

	@Override
	public int getDepartureTime() {
		return 0;
	}	
}
