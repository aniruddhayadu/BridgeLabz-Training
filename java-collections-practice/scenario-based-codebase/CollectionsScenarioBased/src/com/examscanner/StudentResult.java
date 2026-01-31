package com.examscanner;

public class StudentResult implements Comparable<StudentResult> {

	String name;
	int score;

	public StudentResult(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// Sort descending by score
	@Override
	public int compareTo(StudentResult other) {
		return Integer.compare(other.score, this.score);
	}
}