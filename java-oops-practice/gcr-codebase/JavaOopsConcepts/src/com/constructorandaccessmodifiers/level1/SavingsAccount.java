package com.constructorandaccessmodifiers.level1;

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);     // public
        System.out.println("Account Holder: " + accountHolder);     // protected
        System.out.println("Balance: " + getBalance());             // private via getter
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Rahul Sharma", 5000.0);
        sa.displayDetails();

        // Modify balance using setter
        sa.setBalance(7500.0);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}