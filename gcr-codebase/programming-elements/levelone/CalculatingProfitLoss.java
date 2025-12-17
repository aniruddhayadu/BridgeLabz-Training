public class CalculatingProfitLoss{
	public static float profit(float sellingPrice,float costPrice){
		return (sellingPrice-costPrice);
	}
	public static float profitPercentage(float sellingPrice,float costPrice){
		return ((profit(sellingPrice,costPrice)/costPrice)*100);
	}
	public static void main(String args[]){
		float sellingPrice=191;
		float costPrice=121;
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"/nThe Profit is INR "+profit(sellingPrice,costPrice)+" and the Profit Percentages is "+profitPercentage(sellingPrice,costPrice));
	}
}