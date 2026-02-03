package com.streamAPI.stockpricelogger;
import java.util.*;

public class StockPriceLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stock> stockList = new ArrayList<>();
		
		stockList.add(new Stock("google",9999));
		stockList.add(new Stock("invidia",39999));
		stockList.add(new Stock("microsoft",11111111));
		stockList.add(new Stock("open ai",333333));
		stockList.add(new Stock("tesla",999999));
		stockList.add(new Stock("spaceX",39392));
		
		stockList.stream()
				.forEach(System.out::println);
	}

}
