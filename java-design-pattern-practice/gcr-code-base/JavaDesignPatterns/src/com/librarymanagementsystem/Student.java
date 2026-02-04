package com.librarymanagementsystem;

public class Student implements IUser{
	
	protected String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public void showRoles() {
		System.out.println(name+" is a student");
	}
	
	//student get notified when book arrived
	public void getNotified(String message) {
		System.out.println(name+" notified-> "+message);
	}
}
