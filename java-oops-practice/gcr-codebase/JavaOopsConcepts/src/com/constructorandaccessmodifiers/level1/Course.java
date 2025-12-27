package com.constructorandaccessmodifiers.level1;

public class Course {

	String courseName;
	String duration;
	int fee;
	static String instituteName;
	Course(String courseName, String duration, int fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		instituteName = "XYZ";
	}
	void displayCourseDetails() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration);
		System.out.println("Fee: " + fee);
		System.out.println("Institute Name: " + instituteName);
	}
	static void updateInstituteName(String updated) {
		instituteName = updated;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("PCM","5 month",5000);
		Course course2 = new Course("Bio","6 month",8000);
		course1.displayCourseDetails();
		Course.updateInstituteName("ABX");
		course2.displayCourseDetails();
	}

}
