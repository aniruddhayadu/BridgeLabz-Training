//12. Train Reservation Queue 🚆
//Simulate a basic ticket booking system.
//● Show menu with switch
//● Allow multiple bookings using while-loop.
//● Stop booking once seats reach zero (break).
import java.util.Scanner;
public class TrainReservationQueue{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    //Taking seats = 10, and occupied = 0
		int occupied = 0;
		int seats = 10;
		int choice;
		//Using while loop 
		System.out.println();
		while(true){
			if(seats == occupied ){
				System.out.println("Seats if full");
				break;
			}
		// Display the menu for booking the ticket
		System.out.println("Enter 1 for ticket booking");
		System.out.println("Enter 2 for cancelling the ticket");
		System.out.println("Enter 3 for showing the vacant seat and occupied seats");
		System.out.println("Enter 4 for exit from the train reservation system");
		System.out.print("Enter your choice : ");
		
		choice = sc.nextInt();
		System.out.println();
			switch(choice){
				case 1:
				//Booking train seat
				occupied++;
				System.out.println("You have booked a seat in train");
				System.out.println("Thankyou for booking ticket");
				System.out.println();
				break;
				
				case 2:
				if(occupied > 0 ){
					// Cancelling the seat
					occupied--;
					System.out.println("Your seat has been cancled within a day ");
					System.out.println("Thankyou for using booking ticket system");
					System.out.println();
				}
				else{
					System.out.println("Go and book the ticket");
					System.out.println();
				}
				break;
				
				case 3:
				//Display the total seats, occupied seats and vacant seat
				System.out.println("Total seats = "+seats);
				System.out.println("Reserved seats = "+occupied);
				System.out.println("Vacant seats = "+(seats-occupied));
				System.out.println();
				break;
				
				case 4:
				// Exting form the ticket booking system
				System.out.println("Exiting from the ticket booking system ....");
				System.out.println("Thankyou for using booking ticket system");
				System.out.println();
				sc.close();
				return ;
				
				default:
				//Enter the wrong number
				System.out.println("You entered the wrong number");
				System.out.println();
				
			}
		}
	}
	
}