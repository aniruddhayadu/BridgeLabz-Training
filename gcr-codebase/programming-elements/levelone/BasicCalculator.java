import java.util.Scanner;
// creating the class for calculator
public class BasicCalculator{
	public static void main(String[] args){
		// crating scanner variable
		Scanner sc=new Scanner(System.in);
		// creating two variables to take user input
		double n1=sc.nextDouble(), n2=sc.nextDouble();

		// creating variable to perform addition multiplication substraction and division operation
		double addition=n1+n2 , substraction=n1-n2, multiplication=n1*n2, division=n1/n2;

		// displaying the result
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+n1+" and "+n2+ " is "+addition+ ","+substraction+ ","+multiplication+ ", and "+division);
	}
}