import java.util.Scanner;

public class StringCalendarDisplay {

	// Method to get month name
	public static String getMonthName(int month) {
		String[] months = {
			"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"
		};
		if (month >= 1 && month <= 12) {
			return months[month - 1];
		}
		return "";
	}

	// Method to check leap year
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	// Method to get number of days in month
	public static int getNumberOfDays(int month, int year) {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && isLeapYear(year)) {
			return 29;
		}
		return days[month - 1];
	}

	// Method to get the first day of the month (0=Sunday, 1=Monday, ..., 6=Saturday)
	public static int getFirstDay(int month, int year) {
		int m = month;
		int y = year;
		if (m < 3) {
			m += 12;
			y -= 1;
		}
		int k = y % 100;
		int j = y / 100;

		int d = 1; // first day of month

		int f = d + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
		int day = f % 7;

		// Zeller's Congruence returns 0=Saturday, 1=Sunday ... adjust to 0=Sunday
		day = (day + 6) % 7;
		return day;
	}

	public static void displayCalendar(int month, int year) {

		String monthName = getMonthName(month);
		int days = getNumberOfDays(month, year);
		int firstDay = getFirstDay(month, year);

		System.out.println("   " + monthName + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		// Print leading spaces for first day
		for (int i = 0; i < firstDay; i++) {
			System.out.print("    ");
		}

		for (int day = 1; day <= days; day++) {
			System.out.printf("%3d ", day);

			// Move to next line after Saturday
			if ((day + firstDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month (1-12): ");
		int month = sc.nextInt();

		System.out.print("Enter year: ");
		int year = sc.nextInt();

		displayCalendar(month, year);

		sc.close();
	}
}
