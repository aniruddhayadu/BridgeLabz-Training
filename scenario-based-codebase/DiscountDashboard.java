import java.util.Scanner;

public class DiscountDashboard {
    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Constants for discount rates
        final double DISCOUNT_5 = 0.05;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.println("Enter number of items:");
        int numberOfItems = sc.nextInt();

        double totalAmount = 0;

        // Input item prices
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter item price " + (i + 1) + ":");
            double price = sc.nextDouble();
            totalAmount += price;
        }

        // Discount calculation
        double discount = 0.0;

        if (totalAmount >= 5000) {
            discount = totalAmount * DISCOUNT_5;
        } else if (totalAmount >= 2500) {
            discount = totalAmount * DISCOUNT_20;
        } else if (totalAmount >= 1000) {
            discount = totalAmount * DISCOUNT_10;
        }

        // Output result
        System.out.println("Discount = " + discount);
        System.out.println("Amount to Pay = " + (totalAmount - discount));

        sc.close();
    }
}
