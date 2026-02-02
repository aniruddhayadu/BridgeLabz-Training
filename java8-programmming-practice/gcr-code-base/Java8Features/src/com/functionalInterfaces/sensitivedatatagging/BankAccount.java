package com.functionalInterfaces.sensitivedatatagging;

public class BankAccount implements SensitiveData{
	 private String accountNumber;

	    public BankAccount(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }
}
