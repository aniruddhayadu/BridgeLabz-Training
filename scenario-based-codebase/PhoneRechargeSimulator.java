import java.util.Scanner;
public class PhoneRechargeSimulator {
	static void displayOffers(char c) {
		char op = c;
		switch(op) {
			case 'J':
				System.out.println("Offers in Jio:");
				System.out.println("Rs.299 : Unlimited calls, 1.5GB/day, 100SMS/day, 28 days Validity ");
				System.out.println("Rs.349 : Unlimited calls, Unlimited data 5G, 100SMS/day, 28 days Validity ");
				System.out.println("Rs.629 : Unlimited calls, Unlimited data 5G, 100SMS/day, 56 days Validity ");
				break;
			case 'A':
				System.out.println("Offers in Airtel:");
				System.out.println("Rs.299 : Unlimited calls, 1.5GB/day, 100SMS/day, 28 days Validity ");
				System.out.println("Rs.349 : Unlimited calls, Unlimited data 5G, 100SMS/day, 28 days Validity ");
				System.out.println("Rs.449 : Unlimited calls, Unlimited data 5G, 100SMS/day, 28 days Validity ");
				break;
			case 'V':
				System.out.println("Offers in VI:");
				System.out.println("Rs.299 : Unlimited calls, 1.5GB/day, 100SMS/day, 28 days Validity ");
				System.out.println("Rs.349 : Unlimited calls, Unlimited data 5G, 100SMS/day, 28 days Validity ");
				System.out.println("Rs.629 : Unlimited calls, Unlimited data 5G, 100SMS/day, 56 days Validity ");
				break;
			default:
				System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input  =  new Scanner(System.in);
		System.out.println("Welcome to Rechrge Simulator");
		System.out.println("Our available mobile opertors - \n 1. Jio \n 2. Airtel \n 3. Vi ");
		System.out.println("Enter your mobile operator:");
		System.out.println("Press J for jio \nPress A for airtel \nPress V for vi");
		
		char c = input.next().charAt(0);
		displayOffers(c);
		int amount;
		int balance = 0;
		do {
			System.out.println("Enter amount");
			amount = input.nextInt();
			balance+=amount;
			if(amount==0){
				break;
			}
			if(c=='J'){
				System.out.println("Your Jio recharge is done for amount Rs."+amount);
				System.out.println("Balance:"+balance);
			}
			else if(c=='A'){
				System.out.println("Your Jio recharge is done for amount Rs."+amount);
				System.out.println("Balance:"+balance);
			}
			else if(c=='V'){
				System.out.println("Your Vi recharge is done for amount Rs."+amount);
				System.out.println("Balance:"+balance);
			}
		}
		while(amount>0);
	}
}