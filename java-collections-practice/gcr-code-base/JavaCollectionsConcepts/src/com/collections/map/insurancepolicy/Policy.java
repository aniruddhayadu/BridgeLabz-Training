package com.collections.map.insurancepolicy;

import java.time.LocalDate;

public class Policy {

	private int policyNumber;
	private String policyHolderName;
	private LocalDate expiryDate;
	private String coverageType;
	private double premiumAmount;

	public Policy(int policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType,
			double premiumAmount) {

		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public String toString() {
		return "Policy{" + "Number=" + policyNumber + ", Holder='" + policyHolderName + '\'' + ", Expiry=" + expiryDate
				+ ", Coverage='" + coverageType + '\'' + ", Premium=" + premiumAmount + '}';
	}
}
