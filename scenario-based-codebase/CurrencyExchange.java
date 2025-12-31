/*Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.Scanner;
public class CurrencyExchange {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);

		int wantsAnother;

		System.out.println("Currency Exchange Kiosk");


		do {
			System.out.println("Enter INR money");
			System.out.println();
			int inr = sc.nextInt();

			System.out.println("Enter 1. for INR to USD \nEnter 2. for INR to Yen \nEnter 3. for INR to RUB");
			int choose = sc.nextInt();
			System.out.println("Choose Conversion");
			System.out.println();
			switch(choose) {
				case 1:
					System.out.println(inr+" INR := "+(float)inr/89.84+" American USD");
					break;
				case 2:
					System.out.println(inr+" INR := "+(float)inr/0.57+" Japanese YEN");
					break;
				case 3:
					System.out.println(inr+" INR := "+(float)inr/0.88+" Russian RUB");
					break;
				default:
					System.out.println("Invalid");
					break;
			}
			System.out.println("Do you wants another conversion if yes enter 1\n and if not enter 0");
			wantsAnother = sc.nextInt();
		}	
		while(wantsAnother == 1);
	}
}
			