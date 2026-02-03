package com.streamAPI.loggingtransactions;
import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> transactionIds = List.of(
				"afia#2fjn2",
				"uwncji$$gn",
				"ecrq43#$#4q",
				"#CTEQCR#4",
				"CEAC3#0cERe");
		
		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}

}
