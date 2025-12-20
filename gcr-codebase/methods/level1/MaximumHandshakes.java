// A program to find the maximum number of handshakes among student.

import java.util.Scanner;
public class MaximumHandshakes {
	
    // Method to find maximum number of handshakes
    public int maximumNumberHandshakes(int numberOfStudents) {
        
        int combination = (numberOfStudents*(numberOfStudents-1))/2;
        
        return combination;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students : ");
        int numberOfStudents = sc.nextInt();
	

        // Create a MaximumHandshakes object
        MaximumHandshakes obj = new MaximumHandshakes();

        // Call the method to find maximum number of handshakes
        int combination = obj.maximumNumberHandshakes(numberOfStudents); 

        // Display value 
        System.out.println("The number of possible handshakes is: " +combination);

        // Close the Scanner object
        sc.close();
    }
}
