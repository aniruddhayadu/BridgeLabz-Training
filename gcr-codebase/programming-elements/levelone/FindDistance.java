// java program to find  distance in yards and miles for the distance provided by user in feets


import java.util.Scanner;
public class FindDistance{
	public static void main(String[] args){

		// creating a scanner to take user input
		Scanner sc=new Scanner(System.in);

		// creating a variable feet to take distance from user in feet
		double feet=sc.nextDouble();
		// converting distance in yard and mile
		double yard=feet/3 , mile=yard/1760;
		// displaying the result
		System.out.println("The distance in mile is "+mile+" and yard is "+yard);
	}
}