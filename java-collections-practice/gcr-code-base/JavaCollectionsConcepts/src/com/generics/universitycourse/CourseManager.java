package com.generics.universitycourse;

import java.util.List;

class CourseManager {

	public static void showCourses(List<? extends CourseType> courses) {
		for (CourseType course : courses) {
			System.out.println("Evaluation Type: " + course.getEvaluationType());
		}
	}
}
