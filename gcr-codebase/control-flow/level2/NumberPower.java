//program to find the power of a number
import java.util.Scanner;
public class NumberPower 
	{

    		public static void main(String[] args) {

			//scanner object
        		Scanner sc = new Scanner(System.in);

			// user input for number and power
        		System.out.print("Enter number: ");
        		int number = sc.nextInt();
			System.out.print("Enter power: ");
			int power = sc.nextInt();


			//computing the result
			int result=1;

			for (int i = 1; i <= power; i++) {
                		result = result * number;
            		}
			
			System.out.println("Result: " + result);
			sc.close();
		}
	}
