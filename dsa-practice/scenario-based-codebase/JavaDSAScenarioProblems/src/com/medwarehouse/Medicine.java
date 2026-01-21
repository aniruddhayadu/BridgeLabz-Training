package com.medwarehouse;

public class Medicine {

	String name;
	String batchNo;
	int expiryDays; 
	
	public Medicine(String name, String batchNo, int expiryDays) {
		this.name = name;
		this.batchNo = batchNo;
		this.expiryDays = expiryDays;
	}
}
