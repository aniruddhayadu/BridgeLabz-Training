// java program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;

public class PrintDivision{
	public static void main(String[] args){
		float  number1, number2;
		Scanner sc = new Scanner(System.in);

		number1 = sc.nextFloat();
		number2 = sc.nextFloat();

		float quotient = number1 / number2;
		float moduli = number1 / number2;

		System.out.println("The Quotient is "+quotient+" and Reminder is "+moduli+ " of two number "+ number1+" and "+ number2);


	}
}