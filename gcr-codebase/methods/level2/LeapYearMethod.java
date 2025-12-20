// Write a program that takes a year as input and outputs the Year is a Leap Year or not 

import java.util.Scanner;

public class LeapYearMethod {

    	// Method to check Leap Year using conditions a and b
    	public static boolean checkLeapYear(int year) {

        if (year < 1582) {
            	return false;
        }

        //  Leap year rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            	return true;
        }

        return false;
    }


    public static void main(String[] args) {

		//scanner object
        	Scanner sc = new Scanner(System.in);

        	// Take input
        	System.out.print("Enter a year: ");
        	int year = sc.nextInt();

        	// Check and display result
        	if (checkLeapYear(year)) {
            		System.out.println(year + " is a Leap Year");
        	} else {
            		System.out.println(year + " is NOT a Leap Year");
        	}
    	}
}
