// Java program to calculate discounted fees of a university
import java.util.Scanner;
public class DiscountedFeeUserInput{
	public static void main(String[] args){
		// creating an variable for fee
		int fee;

		// creating an variable for discountPercent
		int discountPercent;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fee");
		fee=input.nextInt();
		System.out.println("Enter discountPercent");
		discountPercent=input.nextInt();
		// creating an variable and calculating discount
		double discount = (fee * discountPercent )/100;

		double discountedFee = (double)fee - discount;

		// displaying the result
		System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ discountedFee);

	}
}