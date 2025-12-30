//13. Sandeep’s Fitness Challenge Tracker 🏋️
//♂Each day Sandeep completes a number of push-ups.
//● Store counts for a week.
//● Use for-each to calculate total and average.
//● Use continue to skip rest days.

import java.util.Scanner;
public class FitnessChallengeTracker {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int day = 0;
		int week = 7;
		int pushups;
		int sum = 0;
		int choice;
		int skip = 0;
		//Using while loop 
		System.out.println();
		while(true){
			if(week == day){
				System.out.println("week completed");
				break;
			}
		// Display the menu for fiteness
		System.out.println("Enter 1 for fitness day");
		System.out.println("Enter 2 for skip day");
		System.out.println("Enter 3 for exiting from  fitness challenge");
		System.out.print("Enter your choice : ");
		
		choice = sc.nextInt();
		System.out.println();
			switch(choice){
				case 1:
				//Fitness day
				day++;
				System.out.print("Enter the push-ups : ");
				pushups = sc.nextInt();
				sum += pushups;
				System.out.println();
				break;
				
				case 2:
				//Skip day
				day++;
				skip++;
				System.out.println("You skip this day  ");
				System.out.println();
				break;
				
				case 3:
				//Exit from the fitness challenge
				System.out.println("Exiting from the fitness challenge");
				sc.close();
				System.out.println();
				return;
				
				
				default:
				//Enter the wrong number
				System.out.println("You entered the wrong number");
				System.out.println();
				
				
			}
		}
		//Printing the average, sum, and skip day.
		System.out.println("Average : "+(sum/7));
		System.out.println("Total : "+sum);
		System.out.println("Skip days : "+skip);
	}
}	