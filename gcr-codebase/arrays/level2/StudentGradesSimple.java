import java.util.Scanner;

public class StudentGradesSimple {
    public static void main(String[] args) {

	// scanner object
        Scanner input = new Scanner(System.in);

        // number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();



        // b. Arrays for marks, percentages, grades
        int[] physicsMarks = new int[number];
        int[] chemistryMarks = new int[number];
        int[] mathsMarks = new int[number];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        // input marks and check  positive marks
        for (int index = 0; index < number; index++) {
            System.out.println("enter marks for student " + (index + 1) + ":");

            System.out.print("Physics: ");
            physicsMarks[index] = input.nextInt();
            while (physicsMarks[index] < 0) {
                System.out.print("Enter positive marks for Physics: ");
                physicsMarks[index] = input.nextInt();
            }

            System.out.print("Chemistry: ");
            chemistryMarks[index] = input.nextInt();
            while (chemistryMarks[index] < 0) {
                System.out.print("Enter positive marks for Chemistry: ");
                chemistryMarks[index] = input.nextInt();
            }

            System.out.print("Maths: ");
            mathsMarks[index] = input.nextInt();
            while (mathsMarks[index] < 0) {
                System.out.print("Enter positive marks for Maths: ");
                mathsMarks[index] = input.nextInt();
            }
        }






        // calculate percentage and grade
        for (int index = 0; index < number; index++) {
            int total = physicsMarks[index] + chemistryMarks[index] + mathsMarks[index];
            percentages[index] = (total * 100.0) / 300.0;

            double pct = percentages[index];
            if (pct >= 80) {
                grades[index] = 'A';
            } else if (pct >= 70) {
                grades[index] = 'B';
            } else if (pct >= 60) {
                grades[index] = 'C';
            } else if (pct >= 50) {
                grades[index] = 'D';
            } else if (pct >= 40) {
                grades[index] = 'E';
            } else {
                grades[index] = 'R';
            }
        }




        // display marks percentages and grades
        System.out.println("\nStudent Results:");
        for (int index = 0; index < number; index++) {
            System.out.println("Student " + (index + 1) + ":");
            System.out.println("Physics: " + physicsMarks[index]);
            System.out.println("Chemistry: " + chemistryMarks[index]);
            System.out.println("Maths: " + mathsMarks[index]);
            System.out.println("Percentage: " + percentages[index]);
            System.out.println("Grade: " + grades[index]);
            System.out.println();
        }

        input.close();
    }
}
