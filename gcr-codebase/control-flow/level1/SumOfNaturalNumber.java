import java.util.Scanner;
public class SumOfNaturalNumber {
	 public static void main(String[] args) {

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		// Get input value for number
		int number = input.nextInt();

		//checking number is natural or not and sum 
		if(number%1==0)
		{
			System.out.println("The sum of " +number+ " natural numbers is " + (number*(number+1))/2);
		}
		else
		{
			 System.out.println("The number is " +number+ "not a natural number");
		}
	}
			
}