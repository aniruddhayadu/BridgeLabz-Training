// Write a program to find and return the length of a string without using the length() method 

import java.util.Scanner;

public class FindLengthOfString {

	// method to find length
	public static int findLength(String text) {
		int count = 0;
		try {
			while(true) {
				text.charAt(count);
				count++;
			}
		}
		catch (RuntimeException e) {
		}
		return count;
	}




	public static void main(String args[]) {

		// scanner object
		Scanner sc = new Scanner(System.in);

		// taking input 
		System.out.println("Enter a string :");
		String text = sc.next();

		// user defined method
		int lengthByMethod = findLength(text);

		// builtin method
		int lengthByBuiltIn = text.length();

		// displaying result
		System.out.println("Length using user-defined method : " + lengthByMethod);
		System.out.println("Length using length() method      : " + lengthByBuiltIn);

		sc.close();
	}
}