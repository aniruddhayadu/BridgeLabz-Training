// Rohan’s Library Reminder App 📚
// Calculate fine for late book returns
// ● Input due date and return date
// ● Fine = ₹5 per day if late
// ● Repeat for 5 books using for-loop

import java.util.Scanner;

public class LibraryReminderApp {

    	public static void main(String args[]) {

        	Scanner sc = new Scanner(System.in);

        	int dueDate, returnDate;
        	int finePerDay = 5;
        	int fine;

        	System.out.println("Rohan's Library Reminder App");
        	System.out.println();


        	for (int i = 1; i <= 5; i++) {

            		System.out.println("Book " + i);

            		// Input due date
           	 	System.out.print("Enter due date : ");
            		dueDate = sc.nextInt();

            		// Input return date
            		System.out.print("Enter return date : ");
            		returnDate = sc.nextInt();

            		// Checking late return
            		if (returnDate > dueDate) {
                		fine = (returnDate - dueDate) * finePerDay;
                		System.out.println("Book returned late");
                		System.out.println("Fine = rs " + fine);
            		} 
			else {
                		System.out.println("Book returned on time");
                		System.out.println("No fine");
            		}

            		System.out.println();
        	}
        	sc.close();
    	}
}
