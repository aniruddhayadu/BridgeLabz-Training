import java.util.Scanner;

public class SumOfNumbersUntillZeroOrNegative
	{
		public static void main(String[] args)
			{
				// Create a Scanner Object
				Scanner input = new Scanner(System.in);

        			System.out.println("Enter numbers (0 to stop):");

        			double sum = 0;
        			

        			while (true) 
					{
            					double number = input.nextDouble();

            						if (number <= 0) 
								{
                							break;
            							} 
							else 
								{
                							sum += number;
            							}
       								
							System.out.println("Enter Next number (0 to stop):");
					}
       				System.out.println("Sum = " + sum);
        			input.close();
    			}
	}
