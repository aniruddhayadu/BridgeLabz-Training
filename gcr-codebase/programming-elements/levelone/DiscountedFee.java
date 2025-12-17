// Java program to calculate discounted fees of a university

public class DiscountedFee{
	public static void main(String[] args){
		// creating an variable for fee
		int fee = 125000;

		// creating an variable for discountPercent
		int discountPercent = 10;

		// creating an variable and calculating discount
		double discount = (fee * discountPercent )/100;

		double discountedFee = (double)fee - discount;

		// displaying the result
		System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ discountedFee);

	}
}