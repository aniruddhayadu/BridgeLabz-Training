import java.util.Scanner;

public class SchoolBusAttendanceSystem {

	public static void main(String args[]) {

		String [] studentNames = {"Anni", "Princi", "Divyanshu", "Arif", "Aditya", "Hanuman", "Abhi", "Rohan", "Anurag", "Raja"};
		// scanner object
		Scanner sc = new Scanner(System.in);
		int totalPresent = 0;
		int totalAbsent = 0;
		
		for (String student : studentNames) {
			System.out.println("Student name "+student);
			System.out.print(" Present or Absent? ");
			String status = sc.nextLine();
			if(status.equalsIgnoreCase("Present")) {
				totalPresent++;
			}
			else if (status.equalsIgnoreCase("Absent")) {
				totalAbsent++;
			}
			else {
				totalAbsent++;
			}
		}
		

		System.out.println(" Attendance Summary ");
        	System.out.println("Total Present: " + totalPresent);
        	System.out.println("Total Absent: " + totalAbsent);

        	sc.close();
	}
}