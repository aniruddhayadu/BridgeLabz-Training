import java.util.Scanner;
public class SmallestOfThree {
	 public static void main(String[] args) {

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		// Get input value for numbers
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		// creating a checking variable 
		String temp="False";

		//if first number is the smallest of the 3 numbers or not
	
		if ( number1<number2 && number1<number3 ) {
			temp="True";
		}

		System.out.println ( "Is the first number the smallest? "+temp);
	}
}