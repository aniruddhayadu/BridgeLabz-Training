package com.multithreading.bankingsystem;

public class BankingSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(3000, account), "Customer-1");
        Thread t2 = new Thread(new Transaction(4000, account), "Customer-2");
        Thread t3 = new Thread(new Transaction(2000, account), "Customer-3");
        Thread t4 = new Thread(new Transaction(5000, account), "Customer-4");
        Thread t5 = new Thread(new Transaction(1500, account), "Customer-5");

        
        System.out.println(t1.getName() + " State: " + t1.getState());
        System.out.println(t2.getName() + " State: " + t2.getState());
        System.out.println(t3.getName() + " State: " + t3.getState());
        System.out.println(t4.getName() + " State: " + t4.getState());
        System.out.println(t5.getName() + " State: " + t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
