package com.constructorandaccessmodifiers.level1;

public class Student {
 
	public int rollNumber;       
    protected String name;       
    private double CGPA;          

    public Student(int rollNumber, String name, double CGPA) {
    	this.rollNumber = rollNumber;
    	this.name = name;
    	this.CGPA = CGPA;
    }

    // Getter
    public double getCGPA() {
    	return CGPA;
    }

    // Setter
    public void setCGPA(double CGPA) {
    	this.CGPA = CGPA;
    }
}


