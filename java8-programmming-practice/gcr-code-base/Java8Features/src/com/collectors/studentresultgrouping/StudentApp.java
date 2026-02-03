package com.collectors.studentresultgrouping;
import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = Arrays.asList(
				new Student("Seema","A+"),
				new Student("Rajkumar","A+"),
				new Student("Nitika","B"),
				new Student("Devendra","C"));
		
		Map<String, List<String>> groupedStudents = StudentService.groupStudentsByGrade(students);

		groupedStudents.forEach((grade, names) -> System.out.println(grade + " : " + names));
	}

}
