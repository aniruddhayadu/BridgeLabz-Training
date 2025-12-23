/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results*/

import java.util.Scanner;

public class SubStringCompare {

	// string using charAt()
	public static String subStringByCharAt(String s, int startIndex, int endIndex) {
		String result = "";
		for(int i = startIndex; i < endIndex; i++){
			result += s.charAt(i);
		}
		return result;
	}

	// sub string by substring() 
	public static String subStringBySubString(String s, int startIndex, int endIndex) {
		return s.substring(startIndex, endIndex);
	}

	//compare both string 
	public static boolean compareSubStrings(String s1, String s2) {
		return s1.equals(s2);
	}


	public static void main (String args[]) {

		// scanner object 
		Scanner sc = new Scanner(System.in);

		// taking input for string, start and end index 

		System.out.println("Enter String :");
		String s = sc.nextLine();

		System.out.println("Enter Start and End index :");
		int startIndex = sc.nextInt();
		int endIndex = sc.nextInt();

		String subString1 = subStringByCharAt(s, startIndex, endIndex);
		String subString2 = subStringBySubString(s, startIndex, endIndex);


		System.out.println("Sub string by charAt() :"+subString1);

		System.out.println("Sub string by substring() :"+subString2);

		System.out.println("Sub string are equals  :"+compareSubStrings(subString1,subString2));
	}
}
