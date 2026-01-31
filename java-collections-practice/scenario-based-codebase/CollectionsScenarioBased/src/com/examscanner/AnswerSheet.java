package com.examscanner;

import java.util.*;

//Generic answer sheet for different subjects
public class AnswerSheet<T> {

	private String studentName; // Student name
	private List<String> answers; // Student answers
	private T subjectType; // Subject type (Math / Science)

	public AnswerSheet(String studentName, List<String> answers, T subjectType) {
		this.studentName = studentName;
		this.answers = answers;
		this.subjectType = subjectType;
	}

	public String getStudentName() {
		return studentName;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public T getSubjectType() {
		return subjectType;
	}
}