// java program to find the maximum number of handshakes 

import java.util.Scanner;
public class MaxHandshakes{
	public static void main(String[] args){
		// creating a scanner variable to take user input
		Scanner sc=new Scanner(System.in);

		// creating variable to store n number of students and take user input
		int student=sc.nextInt();

		// calculating total number of handshakes
		int handshake=(student*(student-1))/2;

		//displaying the result
		System.out.println("The number of possible handshake is "+handshake);
}
}