import java.util.Scanner;
public class CheckPositiveNegativeOrZero 
	{
	 public static void main(String[] args) 
		{

			// Create a Scanner Object
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the number");
			// Get input value for age
			int number = input.nextInt();

			//checking the number is positive, negative, or zero
			if(number==0)
				{
					System.out.println("The Number is Zero");
				}
			else if(number>0)
				{
					System.out.println("The Number "+number+ " is Positive");
				}
			else
				{
			 		System.out.println("The Number "+number+ " is Negative");
				}
			input.close();
		}
			
	}