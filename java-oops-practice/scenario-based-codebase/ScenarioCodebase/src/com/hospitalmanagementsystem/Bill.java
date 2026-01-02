package com.hospitalmanagementsystem;

class Bill implements Payable {

	private double baseAmount;
    private double tax;
    private double discount;

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
        this.tax = 0.10 * baseAmount;
        this.discount = 0.05 * baseAmount;
    }
    public double calculatePayment() {
        return baseAmount + tax - discount;
    }
    public void getSummary() {
        System.out.println("Base Amount: " + baseAmount);
        System.out.println("Tax: " + tax);
        System.out.println("Discount: " + discount);
        System.out.println("Total Payable: " + calculatePayment());
    }
}
