import java.util.Scanner;
public class SpringSeason 
	{
	 public static void main(String[] args) 
		{

			// Create a Scanner Object
			Scanner input = new Scanner(System.in);

			// Get input value for date and month
			System.out.println("Enter the Date");
			int date = input.nextInt();
			System.out.println("Enter Month");	
			int month=input.nextInt();
			
			
			//checking the date and month

			if ((month == 3 && date >= 20) || (month == 6 && date <= 20) || (month == 4 || month == 5)) 
				{
					System.out.println("Its a Spring Season");
				} 
			else 
			{
    					System.out.println("Not a Spring Season");
			}

			input.close();
		}
			
	}