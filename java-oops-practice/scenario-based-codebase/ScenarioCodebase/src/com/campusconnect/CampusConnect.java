package com.campusconnect;

public class CampusConnect {
	public static void main(String[] args) {
		Faculty faculty = new Faculty(101, "Dr. Smith", "smith@college.edu", "Computer Science");
	    Student student1 = new Student(201, "Alice", "alice@student.edu");

	    Course javaCourse = new Course("Java Programming", faculty);

	    student1.enrollCourse(javaCourse);
	    student1.addGrade(85);
	    student1.addGrade(90);

	    faculty.printDetails();
	    System.out.println();
	    student1.printDetails();
	    System.out.println();
	    javaCourse.showCourseDetails();
    }
}