package com.streamAPI.iotsensor;

public class Sensor {
	private double value;

	public Sensor(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Sensor [value=" + value + "]";
	}
}
