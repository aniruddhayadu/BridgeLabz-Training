package com.generics.universitycourse;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course<ExamCourse> math = new Course<>("Mathematics", "Science", new ExamCourse());
		Course<AssignmentCourse> cs = new Course<>("Data Structures", "Computer Science", new AssignmentCourse());
		Course<ResearchCourse> phd = new Course<>("AI Research", "Research Dept", new ResearchCourse());
		
		math.display();
		cs.display();
		phd.display();
		
		List<CourseType> evaluationList = new ArrayList<>();
		
		evaluationList.add(new ExamCourse());
		evaluationList.add(new AssignmentCourse());
		evaluationList.add(new ResearchCourse());
		
		CourseManager.showCourses(evaluationList);
	}

}
