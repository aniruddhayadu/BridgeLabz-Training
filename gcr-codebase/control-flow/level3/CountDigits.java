// Program to count the number of digits in an integer
import java.util.Scanner;

public class CountDigits
	{
    		public static void main(String[] args)
    			{
        			Scanner sc = new Scanner(System.in);

        			// Get input number
        			System.out.print("Enter a number: ");
        			int number = sc.nextInt();

        			// Variable to store count of digits
        			int count = 0;

        			// Loop until number becomes 0
        			while (number != 0)
        				{
            					// Remove last digit
            					number = number / 10;

            					// Increase count
            					count++;
        				}

        			// Display result
        			System.out.println("Number of digits: " + count);

        			sc.close();
    			}
		}
