package com.zipzipmart;
import java.time.LocalDate;

public class Transaction {
	LocalDate date;
	double amount;

	public Transaction(LocalDate date, double amount) {

		this.date = date;
		this.amount = amount;
	}
}
