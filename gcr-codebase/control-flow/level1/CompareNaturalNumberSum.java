import java.util.Scanner;

public class CompareNaturalNumberSum
	{
		public static void main(String[] args)
			{
				// Create a Scanner Object
				Scanner input = new Scanner(System.in);

        			System.out.println("Enter number ");
				int number = input.nextInt();
        			
        			int sum=0,result=1;
				// checking number is natural or not
				if(number>0)
					{
						// sum using formula 
						result=(number*(number+1))/2;
						// sum using while loop
        					while (number>0) 
							{
								sum+=number;
            							number--;
							}
					}
				

				// compare both results
				if (sum==result)
				{
					System.out.println("The result is :"+sum);
				}	
				input.close();
    			}
	}
