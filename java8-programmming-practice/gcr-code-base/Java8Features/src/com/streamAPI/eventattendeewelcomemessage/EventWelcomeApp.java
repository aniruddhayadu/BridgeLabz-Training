package com.streamAPI.eventattendeewelcomemessage;
import java.util.*;

public class EventWelcomeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> attendees = Arrays.asList("Aniruddha",
				"Divyanshu",
				"Nikki",
				"Pinku",
				"Aditya");
		attendees.forEach(name -> System.out.println("Welcome to event, " + name + "! :-) ..."));
	}

}
