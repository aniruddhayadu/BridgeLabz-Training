/*Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/

import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void seatType(int op) {
        switch(op) {
            case 1: 
                System.out.println("Gold Seat");
                break;
            case 2:
                System.out.println("Silver Seat");
                break;
            default:
                System.out.println("Invalid Seat");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeat = 5;

        while(totalSeat > 0) {
            totalSeat--;

            System.out.println("Movie Type:\n1 for Horror\n2 for Romantic\n3 for Comedy");
            int movieChoice = sc.nextInt();

            int price = 0;
            System.out.println("Enter 1 for Gold Seat and 2 for Silver Seat");
            int seatChoice = sc.nextInt();
            seatType(seatChoice);

            System.out.println("Do you want Snacks? 1 for Yes, 2 for No");
            int snacks = sc.nextInt();

            switch(movieChoice) {
                case 1:
                    price = 300;
                    System.out.println("Horror Movie Seat Booked");
                    break;
                case 2:
                    price = 250;
                    System.out.println("Romantic Movie Seat Booked");
                    break;
                case 3:
                    price = 200;
                    System.out.println("Comedy Movie Seat Booked");
                    break;
                default:
                    System.out.println("Invalid Movie Choice");
            }

            if (snacks == 1) {
                price += 100;
            }

            System.out.println("Total Price: " + price);
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
