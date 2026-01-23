package com.universitydigitalrecord;

public class Student {
	String name;
	String branch;
	int semister;
	int roll;
	Student left;
	Student right;
	public Student(String name, String branch, int semister, int roll) {
		this.name = name;
		this.branch = branch;
		this.semister = semister;
		this.roll = roll;
		this.left = null;
		this.right = null;
	}

}
