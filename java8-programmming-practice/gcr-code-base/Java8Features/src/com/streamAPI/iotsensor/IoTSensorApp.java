package com.streamAPI.iotsensor;
import java.util.List;

public class IoTSensorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sensor> list = List.of(
				new Sensor(23.3),
				new Sensor(73.2),
				new Sensor(13.2),
				new Sensor(31.2),
				new Sensor(43.2)
				);
		
		double threeshold = 20.5;
		
		list.stream()
			.filter(Sensor -> Sensor.getValue() > threeshold)
			.forEach(System.out::println);
	}

}
