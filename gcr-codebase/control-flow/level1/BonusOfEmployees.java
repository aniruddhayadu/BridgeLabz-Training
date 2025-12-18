import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking salary input
        System.out.print("Enter salary: ");
        int salary = input.nextInt();

        // Taking years of service input
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0;

        // Check bonus eligibility
        if (yearsOfService > 5) {
            bonus = (salary * 5) / 100.0;
        }

        // Display result
        System.out.println("Bonus of the employee: " + bonus);

        input.close();
    }
}
