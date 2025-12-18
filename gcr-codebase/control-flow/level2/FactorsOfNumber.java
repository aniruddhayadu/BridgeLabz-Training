
import java.util.Scanner;

public class FactorsOfNumber 
	{

    		public static void main(String[] args) 
			{
				//scanner object
        			Scanner sc = new Scanner(System.in);

        			// enter the number
       				System.out.print("Enter number: ");
        			int number = sc.nextInt();
		
				//checking and printing the factors of number
		
				for (int i=1;i<=number;i++)	
					{
						if(number%i==0) 
							{
								System.out.println("factors is: "+i);
							}
					}
			}
	}