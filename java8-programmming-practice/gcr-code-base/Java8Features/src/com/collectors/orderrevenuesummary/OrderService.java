package com.collectors.orderrevenuesummary;
import java.util.*;
import java.util.stream.Collectors;

// Service class for revenue calculation
public class OrderService {

	// Sum order totals per customer
	public static Map<String, Double> getRevenueByCustomer(List<Order> orders) {
		return orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomerName, Collectors.summingDouble(Order::getTotal)));
	}
}