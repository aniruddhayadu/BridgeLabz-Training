import java.util.Scanner;

public class BMICalculationArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        //  arrays
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        int[] status = new int[n];

        //  input height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight: ");
            weight[i] = sc.nextDouble();
        }

        // calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = 1;
            else if (bmi[i] <= 24.9)
                status[i] = 2;
            else if (bmi[i] <= 39.9)
                status[i] = 3;
            else
                status[i] = 4;
        }

        //  display result
        System.out.println("\nBMI DETAILS");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + height[i]);
            System.out.println("Weight : " + weight[i]);
            System.out.println("BMI    : " + bmi[i]);

            if (status[i] == 1)
                System.out.println("Status : Underweight");
            else if (status[i] == 2)
                System.out.println("Status : Normal");
            else if (status[i] == 3)
                System.out.println("Status : Overweight");
            else
                System.out.println("Status : Obese");

            System.out.println();
        }

        sc.close();
    }
}
