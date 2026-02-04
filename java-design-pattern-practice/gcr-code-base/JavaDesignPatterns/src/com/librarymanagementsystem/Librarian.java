package com.librarymanagementsystem;

public class Librarian implements IUser{
	protected String name;

	public Librarian(String name) {
		this.name = name;
	}

	@Override
	public void showRoles() {
		System.out.println(name+" is a librarian");
	}
	
	//librarian get notified when book arrived
	public void getNotified(String message) {
		System.out.println(name+" notified-> "+message);
	}
}
