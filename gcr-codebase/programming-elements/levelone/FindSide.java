//  Java program to find the side of the square whose parameter you read from user 
import java.util.Scanner;
public class FindSide{
	public static void main(String[] args){
		// creating a scanner to take user input
		Scanner sc=new Scanner(System.in);

		// creating a variable to store perimeter
		double perimeter=sc.nextDouble();

		// creating a variable to find size
		double side=perimeter/4;

		//Displaying the result
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}