import java.util.Scanner;

public class SumOfNNumbers
	{
		public static void main(String[] args)
			{
				Scanner input = new Scanner(System.in);

        			System.out.println("Enter numbers (0 to stop):");

        			double sum = 0;
        			boolean loopCheck = true;

        			while (loopCheck) 
					{
            					double number = input.nextDouble();

            						if (number == 0) 
								{
                							loopCheck = false;
            							} 
							else 
								{
                							sum += number;
            							}
       								}

       				System.out.println("Sum = " + sum);
        			input.close();
    			}
	}
