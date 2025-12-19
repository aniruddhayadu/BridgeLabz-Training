import java.util.Scanner;

public class BMIMultiDimensionalSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Create arrays
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];



        //  input height and weight 
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter height : ");
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Height must be positive  enter again: ");
                personData[i][0] = sc.nextDouble();
            }

            System.out.print("Enter weight : ");
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Weight must be positive  enter again: ");
                personData[i][1] = sc.nextDouble();
            }
        }



        // calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 5: Display all persons data
        System.out.println("BMI Data report");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + personData[i][0]);
            System.out.println("Weight : " + personData[i][1]);
            System.out.println("BMI    : " + personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
