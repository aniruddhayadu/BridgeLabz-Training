// Write a program to demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
	
	// generating exception 

	public static void generateException (String [] names) {
		 System.out.println(names[names.length]);
	}

	// handling 
	public static void handlingException (String []names) {
		
		try {
			System.out.println(names[names.length]);
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("ArrayIndexOutOfBoundsException caught successfully");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException caught successfully");
		}

	}

	public static void main(String args[]) {
	
		// scanner object
		Scanner sc = new Scanner(System.in);

		// taking user input
		//enter number 
		System.out.println("Enter Number");
		int n = sc.nextInt();
		System.out.println("Enter String Array");
		String[] names = new String[n];

		System.out.println("Enter names");
		for (int i = 0; i < n; i++) {
			names[i] = sc.next();
		}

		// generating exception 

		System.out.println("generating exception");
		
		try {
			generateException(names);
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println("ArrayIndexOutOfBoundsException occurred");
		}

		// handling 
		
		System.out.println("Handling Exception");
	
		handlingException(names);
		
		sc.close();
	}
}

	