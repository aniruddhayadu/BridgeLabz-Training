import java.util.Scanner;
public class PesonCanVote 
	{
	 public static void main(String[] args) 
		{

			// Create a Scanner Object
			Scanner input = new Scanner(System.in);
			System.out.println("Enter person's age");
			// Get input value for age
			int age = input.nextInt();

			//checking number is natural or not and sum 
			if(age>=18)
				{
					System.out.println("The person's age is " +age+ " and can vote.");
				}
			else
				{
			 		System.out.println("The person's age is " +age+ " and cannot vote.");
				}
			input.close();
		}
			
	}