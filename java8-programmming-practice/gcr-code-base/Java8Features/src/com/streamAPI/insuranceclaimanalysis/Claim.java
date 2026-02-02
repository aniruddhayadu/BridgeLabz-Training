package com.streamAPI.insuranceclaimanalysis;

public class Claim {
	private int claimId;
	private String name;
	private String type;
	private double amount;
	
	public Claim(int claimId, String name, String type, double amount) {
		this.claimId = claimId;
		this.name = name;
		this.type = type;
		this.amount = amount;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", name=" + name + ", type=" + type + ", amount=" + amount + "]";
	}
}
