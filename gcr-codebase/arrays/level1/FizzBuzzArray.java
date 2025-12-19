import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
	// scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

	String fizzBuzzArray[]= new String[number];
	//checking FizzBuzz and positive number
        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                   fizzBuzzArray[i-1]="FizzBuzz";
                } 
                else if (i % 3 == 0) {
                    fizzBuzzArray[i-1]="Fizz";
                } 
                else if (i % 5 == 0) {
                    fizzBuzzArray[i-1]="Buzz";
                } 
                else {
                    fizzBuzzArray[i-1]=""+i;
                }
            }
	    for (int i = 1; i <= number; i++) {
		    System.out.println("Position :"+i+" ="+fizzBuzzArray[i-1]);
	    }

        } else {
            System.out.println("please enter a positive integer");
        }

        input.close();
    }
}
