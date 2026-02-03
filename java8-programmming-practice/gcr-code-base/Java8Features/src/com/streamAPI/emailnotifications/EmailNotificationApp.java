package com.streamAPI.emailnotifications;
import java.util.*;

public class EmailNotificationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = List.of(
				"anni@email.com",
				"princi@gmail.com",
				"pinku@gmail.com",
				"golu@gmail.com",
				"nikki@gmail.com");
		
		emails.stream()
			.forEach(email -> sendEmailNotification(email));
	}
	public static void sendEmailNotification(String email) {
		System.out.println("Email sent successfully to email : "+email);
	}
}
