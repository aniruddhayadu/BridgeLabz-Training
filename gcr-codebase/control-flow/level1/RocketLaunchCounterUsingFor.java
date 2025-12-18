import java.util.Scanner;
public class RocketLaunchCounterUsingFor 
	{
	 public static void main(String[] args) 
		{

			// Create a Scanner Object
			Scanner input = new Scanner(System.in);

			// Get input value for Rocket Launch Counter
			System.out.println("Enter the number counter");
			int numberCounter = input.nextInt();
			
			
			
			//waiting for launch rocket 

			for (int i=numberCounter; i>0; i--)
				{
					if (i==1)
						{
							System.out.println("Rocket launched");
						}
				}
			input.close();
		}
			
	}