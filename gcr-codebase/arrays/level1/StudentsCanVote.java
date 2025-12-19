//check whether the student can vote depending on his/her age is greater or equal to 18

import java.util.Scanner;
 
class StudentsCanVote {
 
    	public static void main(String[] args) {
		// scanner object
        	Scanner input = new Scanner(System.in);
		
		int studentAge[] = new int [10];
		
		// taking input for the students age


		for ( int index=0; index < studentAge.length; index++) {
			studentAge[index] = input.nextInt();
			}
		
		// printing which student can vote
		for ( int index=0; index < studentAge.length; index++) {
			if(studentAge [index] < 1) {
				System.out.println ( "Invalid age" );
			} 
			else if (studentAge [index] < 18) {
				System.out.println ( "The student with the age " +studentAge[index]+ " cannot vote." );
			} 
			else {
				System.out.println ( "The student with the age " +studentAge[index]+ " can vote." );
			}
		}
	}
}