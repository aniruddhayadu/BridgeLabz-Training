package com.inheritance.bankaccount;

public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA1001", 5000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA1002", 2000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount("FD1003", 10000, 12);

        savings.displayAccountType();
        System.out.println();

        checking.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}

