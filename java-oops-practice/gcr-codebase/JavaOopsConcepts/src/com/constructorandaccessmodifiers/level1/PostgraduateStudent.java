package com.constructorandaccessmodifiers.level1;

//Subclass 
class PostgraduateStudent extends Student {


	public PostgraduateStudent(int rollNumber, String name, double CGPA) {
		super(rollNumber, name, CGPA);
	}

	public void displayDetails() {
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Name: " + name);      
		System.out.println("CGPA: " + getCGPA()); 
	}
	 public static void main(String[] args) {
	     PostgraduateStudent pg = new PostgraduateStudent(1, "John", 8.2);
	     pg.displayDetails();

	     pg.setCGPA(8.8);
	     System.out.println("Updated CGPA: " + pg.getCGPA());
	 }
	
}
