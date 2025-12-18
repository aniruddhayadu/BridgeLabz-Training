import java.util.Scanner;
public class RocketLaunchCounter 
	{
	 public static void main(String[] args) 
		{

			// Create a Scanner Object
			Scanner input = new Scanner(System.in);

			// Get input value for Rocket Launch Counter
			System.out.println("Enter the number counter");
			int numberCounter = input.nextInt();
			
			
			
			//waiting for launch rocket 

			while(numberCounter>1)
				{
					numberCounter--;
					if (numberCounter==1)
						{
							System.out.println("Rocket launched");
						}
				}
			input.close();
		}
			
	}