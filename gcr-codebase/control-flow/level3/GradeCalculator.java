// Program to calculate percentage, grade, and remarks based on marks
import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = input.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = input.nextDouble();

        // Calculate total and percentage
        double total = physics + chemistry + maths;
        double percentage = total / 3;

        // Variables to store grade and remarks
        String grade = "";
        String remarks = "";

        // Determine grade and remarks based on percentage
        if (percentage >= 80)
        {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        }
        else if (percentage >= 70)
        {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        }
        else if (percentage >= 60)
        {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        }
        else if (percentage >= 50)
        {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        }
        else if (percentage >= 40)
        {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        }
        else
        {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display output
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
