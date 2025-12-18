import java.util.Scanner;
public class NumberIsDivisibleBy5 {
	 public static void main(String[] args) {

	// Create a Scanner Object
	Scanner input = new Scanner(System.in);

	// Get input value for number
	int origNumber = input.nextInt();

	//if number is divisible by 5 result is true
	if ( origNumber % 5 == 0 ) {
		System.out.println ( "Is the number "+origNumber+" divisible by 5? Yes");
	}
	}
}