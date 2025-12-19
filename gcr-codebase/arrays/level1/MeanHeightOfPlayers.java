//a program to find the mean height of players present in a football team

import java.util.Scanner;
 
class MeanHeightOfPlayers {
 
    	public static void main(String[] args) {
		// scanner object
        	Scanner input = new Scanner(System.in);
		
		double heights[] = new int [11];
		double sumOfAll=0,mean=0;

		System.out.print("Enter  heights: ");

		// taking input for the players height and sum of all heights


		for ( int index=0; index < heights.length; index++) {
			heights[index] = input.nextDouble();
			sumOfAll+=heights[index];
		}
		

		// computing mean
		mean= sumOfAll/11;
		System.out.println("The mean height of the football team: "+mean);
	}
}