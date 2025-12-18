import java.util.Scanner;

public class FactorialUsingFor
	{
		public static void main(String[] args)
			{
				// Create a Scanner Object
				Scanner input = new Scanner(System.in);

        			System.out.println("Enter number ");
				int number = input.nextInt();
        			
            			// computing factorial 
	
				int factorial=1;
				for (int i=1;i<=number;i++)
					{
						factorial*=i;
					}						
				System.out.println("Factorial of Number is :"+factorial);
				input.close();
    			}
	}
