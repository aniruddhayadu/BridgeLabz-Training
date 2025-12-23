// Write a program to convert the complete text to uppercase and compare the results

import java.util.Scanner;

public class UpperCaseCompare {
	
	// user define method to convert 

	public static String userUpperCase(String text) {
		int n = text.length();
		String result = "";
		for (int i = 0; i < n; i++) {
			char temp = text.charAt(i);
			if(temp >= 'a' && temp <= 'z') {
				temp = (char)(temp - 32);
			}
			result += temp;
		}
		return result;
	}


	// method to compare two strings 
	public static boolean compareStrings(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
	
	// scanner object 

	Scanner sc = new Scanner (System.in);

	System.out.println("Enter string ");

	String text = sc.nextLine();
	
	String s1 = userUpperCase(text);

	String s2 = text.toUpperCase();

	System.out.println("String using user define method :"+s1);

	System.out.println("String using user predefine method :"+s2);

	System.out.println("Both strings are Equals  :"+compareStrings(s1,s2));

	sc.close();	

	}
}



	