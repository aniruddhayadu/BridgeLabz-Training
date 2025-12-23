//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;
public class CheckTwoStringEquals {
	// method to chack 
	public static boolean compareTwoStrings (String first, String second) {
		
		// check by size 

		if (first.length() != second.length()) {
			return false;
		}

		for (int i = 0; i < first.length(); i++) {
			if(first.charAt(i)==second.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main (String args[]){

		// scanner object 
		Scanner sc = new Scanner(System.in);

		// input for two string 
		System.out.println("Enter Strigs :");

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
	

		// checking and printing the comparison result 

		System.out.println("Both strings are equals :"+compareTwoStrings(s1, s2));

		sc.close();
	}
}
		