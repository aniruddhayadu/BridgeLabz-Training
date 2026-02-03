package com.streamAPI.transformingnames;
import java.util.*;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = Arrays.asList(new Customer("Aniruddha"),
				new Customer("Divyanshu"),
				new Customer("Pinku"),
				new Customer("Aditya"));
		
		List<String> displayNames = CustomerService.getFormattedNames(customers);

		displayNames.forEach(System.out::println);
	}

}
