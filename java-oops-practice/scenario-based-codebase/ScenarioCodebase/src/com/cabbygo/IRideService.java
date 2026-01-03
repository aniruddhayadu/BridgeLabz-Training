package com.cabbygo;

interface IRideService {
    void bookRide(Driver driver, Vehicle vehicle, double distance);
    void endRide();
}