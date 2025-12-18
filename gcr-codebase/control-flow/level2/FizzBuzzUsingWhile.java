import java.util.Scanner;

public class FizzBuzzUsingWhile {

    public static void main(String[] args) {
	// scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();


	//checking FizzBuzz and positive number
        if (number > 0) {
	    int i=1;
            while(i<=number){

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }
		i++;
            }

        } else {
            System.out.println("please enter a positive integer");
        }

        input.close();
    }
}
