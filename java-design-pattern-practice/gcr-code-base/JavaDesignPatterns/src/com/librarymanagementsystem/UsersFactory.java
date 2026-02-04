package com.librarymanagementsystem;

public class UsersFactory {
	public static IUser createUser(String userType, String userName) {
		switch(userType.toLowerCase()) {
			case "student":
				return new Student(userName);
				
			case "faculty":
				return new Faculty(userName);
				
			case "librarian":
				return new Librarian(userName);
			
			default:
				throw new IllegalArgumentException("Unkowns type");
		}
	}
}
