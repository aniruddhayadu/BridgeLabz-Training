package com.collections.map.banksystem;

public class BankingApp {

	public static void main(String[] args) {

		BankingSystem bank = new BankingSystem();

		bank.addAccount(1001, 5000);
		bank.addAccount(1002, 12000);
		bank.addAccount(1003, 8000);

		bank.displayAccounts();

		bank.requestWithdrawal(1001, 2000);
		bank.requestWithdrawal(1003, 9000);
		bank.requestWithdrawal(1002, 3000);

		bank.processWithdrawals();

		bank.displaySortedByBalance();
	}
}
