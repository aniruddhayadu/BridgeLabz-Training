package com.geomeasure;

import java.util.ArrayList;
import java.util.Scanner;

public class LineComparisonApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Line> lines = new ArrayList<>();

		System.out.print("Enter number of lines to compare: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nEnter coordinates for Line " + i);
			System.out.print("x1 y1 x2 y2: ");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();

			Line line = new Line(x1, y1, x2, y2);
			lines.add(line);
		}

		compareLines(lines);

		sc.close();
	}

	// Method to compare all lines
	public static void compareLines(ArrayList<Line> lines) {

		for (int i = 0; i < lines.size() - 1; i++) {

			double length1 = lines.get(i).calculateLength();
			double length2 = lines.get(i + 1).calculateLength();

			System.out.println("\nComparing Line " + (i + 1) + " and Line " + (i + 2));

			if (length1 == length2) {
				System.out.println("Both lines are equal in length.");
			} else if (length1 > length2) {
				System.out.println("Line " + (i + 1) + " is longer.");
			} else {
				System.out.println("Line " + (i + 2) + " is longer.");
			}
		}
	}
}