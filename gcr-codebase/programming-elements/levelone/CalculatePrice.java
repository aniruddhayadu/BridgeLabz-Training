

// java program to input unit price and quantity & calculate total price.


import java.util.Scanner;
public class CalculatePrice{
	public static void main(String[] args){
		// creating a scanner to take user input
		Scanner sc=new Scanner(System.in);

		// creating variables to store units and quantity and taking user input
		int unit=sc.nextInt();
		int qty=sc.nextInt();

		// creating the variable for calclating the price
		double price=unit*qty;

		// displaying the result
		System.out.println("The total purchase price is INR "+price+" if the quantity "+qty+" and unit price is INR "+unit);
	}
}