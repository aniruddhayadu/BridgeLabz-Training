package com.streamAPI.transformingnames;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerService {

	public static List<String> getFormattedNames(List<Customer> customers) {
		return customers.stream().map(Customer::getName)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
	}
}
