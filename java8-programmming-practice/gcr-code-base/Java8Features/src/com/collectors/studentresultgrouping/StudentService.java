package com.collectors.studentresultgrouping;
import java.util.*;
import java.util.stream.Collectors;


public class StudentService {


	public static Map<String, List<String>> groupStudentsByGrade(List<Student> students) {
		return students.stream().collect(Collectors.groupingBy(Student::getGrade,
				Collectors.mapping(Student::getName,
						Collectors.toList())));
	}
}