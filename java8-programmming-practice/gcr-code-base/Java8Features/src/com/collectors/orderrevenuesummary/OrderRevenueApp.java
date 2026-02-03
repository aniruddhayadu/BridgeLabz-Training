package com.collectors.orderrevenuesummary;
import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> orders = Arrays.asList(new Order("Anirudda", 2500), new Order("Divyanshu", 1800), new Order("Rohan", 3200),
				new Order("Divyanshu", 1500), new Order("Rohan", 700));

		Map<String, Double> revenueSummary = OrderService.getRevenueByCustomer(orders);

		revenueSummary.forEach((customer, total) -> System.out.println(customer + " Total Revenue: ₹" + total));
	}

}
