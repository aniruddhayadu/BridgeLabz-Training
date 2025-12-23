//Write a program to trim the leading and trailing spaces from a string using the charAt() method 

import java.util.Scanner;

public class LeadingAndTrailing {
	
	// method to return leading and trailing spaces

	public static int [] returnStartAndEndPoints (String text) {
		
		int leading = 0;
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i)==' ') {
				leading = i;
				break;
			}
		}
		int trailing = 0;
		for (int i = text.length()-1; i >= 0; i--) {
			if(text.charAt(i)==' ') {
				trailing = i;
				break;
			}
		}
		int arr [] = new int []{leading, trailing};
		return arr;
	}

	// method for sub string 

	public static String subStringByUser(String s, int startingIndex, int endIndex) {
		String result = "";

		for (int i = startingIndex; i <endIndex; i++) {
			result += s.charAt(i);
		}

		return result;
	}



	public static boolean compareSubStrings (String s1, String s2) {
		 
		if (s1.length() != s2.length()) {
			return false;
		}
		for ( int i = 0; i < s1.length(); i++ ) {
			if( s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		return true;
	}



	public static void main (String args[]) {
		// scanner object
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter string");

		String text = sc.nextLine();
	
		int points[] = returnStartAndEndPoints(text);
		
		int startingIndex = points[0];
		int endIndex = points[1];

		String s1 = subStringByUser(text , startingIndex, endIndex);
		String s2 = text.substring(startingIndex, endIndex);

		System.out.println("String by user define method :"+ s1);
		System.out.println("String by pre define method :"+ s2);

		System.out.println("Both sub strings are equals :"+compareSubStrings(s1, s2));

		sc.close();
	}
}

	

		


	