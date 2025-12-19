import java.util.Scanner;

public class import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {

	//scanner object
        Scanner input = new Scanner(System.in);


        // number of students
        System.out.print("Enter number of students: ");
        int number = input.nextInt();


        // 2D array for marks
        int[][] marks = new int[number][3]; 
        double[] percentages = new double[number];
        char[] grades = new char[number];


        // input marks with checking positive marks

        for (int index = 0; index < number; index++) {
            System.out.println("Enter marks for student " + (index + 1) + ":");
            for (int subject = 0; subject < 3; subject++) {
                marks[index][subject] = input.nextInt();
                while (marks[index][subject] < 0) {
                    System.out.print("Marks must be positive. Enter again: ");
                    marks[index][subject] = input.nextInt();
                }
            }
        }




        // calculate percentage and grade
        for (int index = 0; index < number; index++) {

            int total = marks[index][0] + marks[index][1] + marks[index][2];
            percentages[index] = (total) / 3.0;

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



        // display marks, percentages and grades

        System.out.println("student results:");


        for (int index = 0; index < number; index++) {
            System.out.println("Student " + (index + 1) + ":");
            System.out.println("Physics: " + marks[index][0]);
            System.out.println("Chemistry: " + marks[index][1]);
            System.out.println("Maths: " + marks[index][2]);
            System.out.println("Percentage: " + percentages[index]);
            System.out.println("Grade: " + grades[index]);
            System.out.println();
        }

        input.close();
    }
}