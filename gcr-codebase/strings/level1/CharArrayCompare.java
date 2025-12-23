/* Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result  */

import java.util.Scanner;
public class CharArrayCompare {

	//method to return char array 
	public static char[] getCharsByMethod(String s) {
		char [] arr = new char[s.length()];
	
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		return arr;
	}

	// compare two char arrays 
	public static boolean compareCharArrays(char[] arr1, char[]arr2) {

		if(arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		
		// scanner object
		Scanner sc = new Scanner(System.in);
	
		// taking input string 

		System.out.println("Enter String :");
		String s = sc.next();

		char[] arr1 = getCharsByMethod(s);

		// array using built in method 
		char[] arr2 = s.toCharArray();


		System.out.print("Characters using user-defined method : ");
		for(char c : arr1) {
			System.out.print(c + " ");
		}
		
		System.out.println();

		System.out.print("Characters using toCharArray() method : ");
		for (char c : arr2) {
			System.out.print(c + " ");
		}

		System.out.println();

		// comparing both arrays
		System.out.println("Both character arrays are equal : "
				+ compareCharArrays(arr1, arr2));

		sc.close();
	
		
	}
}