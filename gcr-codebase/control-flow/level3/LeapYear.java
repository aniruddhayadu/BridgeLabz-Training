// Program to check whether a year is a Leap Year or not
import java.util.Scanner;

public class LeapYear
{
    	public static void main(String[] args)
    		{
        		Scanner sc = new Scanner(System.in);

        		System.out.print("Enter year: ");
        		int year = sc.nextInt();

        		// Check for Gregorian calendar validity
        		if (year < 1582)
        			{
            				System.out.println("Year should be 1582 or later.");
        			}
        		else
        			{

            		if (year % 400 == 0)
           		 	{
                			System.out.println("Leap Year ");
            			}
            		else if (year % 100 == 0)
            			{
                			System.out.println("Not a Leap Year ");
            			}
            		else if (year % 4 == 0)
            			{
                			System.out.println("Leap Year ");
            			}
            		else
            			{
                			System.out.println("Not a Leap Year ");
            			}

            	}

        	sc.close();
    	}
}
