//Write a program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;
public class IndexOutOfBoundsException {
	
	// method to generate 

	public static void generateException(String text) {
		System.out.println(text.charAt(text.length()+1));
	}


	// Method to handle StringIndexOutOfBoundsException
	public static void handleException(String text) {

		try {
			// accessing index beyond string length
			System.out.println(text.charAt(text.length()+1));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught successfully");
		}
	}

	
	public static void main(String args[]) {
		
		// scanner object 
		Scanner sc = new Scanner(System.in);

		// taking user input
		System.out.println("Enter a String :");
		String text = sc.next();

		
		System.out.println("generating Exception");
		try {
			generateException(text);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception occurred");
		}

		// handle exception
		System.out.println("Handling Exception");
		handleException(text);

		sc.close();
	}
}

		

