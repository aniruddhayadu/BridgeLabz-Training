package com.constructorandaccessmodifiers.level1;

public class Circle {

		
	//constructors
	Circle()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Circle(int r)
    {
        System.out.println(r);
    }
		
		public static void main(String[] args) {
			new Circle();
		}
}



