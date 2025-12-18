// Program to check whether a number is an Armstrong Number or not
import java.util.Scanner;

public class ArmstrongNumber
	{
	 	public static void main(String[] args)
    			{
        			Scanner sc = new Scanner(System.in);

        			// Get input number
        			System.out.print("Enter a number: ");
        			int number = sc.nextInt();

        			// Variables as per hint
        			int originalNumber = number;
        			int sum = 0;

        			// Loop until originalNumber becomes 0
        			while (originalNumber != 0)
        				{
            					// Get last digit
            					int digit = originalNumber % 10;

            					// Find cube of the digit and add to sum
            					sum = sum + (digit * digit * digit);

            					// Remove last digit
            					originalNumber = originalNumber / 10;
        				}

        			// Check if number is Armstrong or not
        			if (sum == number)
        			{
            				System.out.println(number + " is an Armstrong Number");
        			}
        			else
        			{
            				System.out.println(number + " is not an Armstrong Number");
        			}

        			sc.close();
    			}
	}
