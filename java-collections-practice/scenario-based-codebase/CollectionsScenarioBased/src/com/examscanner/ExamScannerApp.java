package com.examscanner;

import java.util.*;

//Main application
public class ExamScannerApp {

	public static void main(String[] args) {

		// Answer key
		List<String> answerKey = Arrays.asList("A", "B", "C", "D", "A", "B", "C");

		// Evaluate Math subject
		Map<String, Integer> scores = ExamEvaluator.evaluate("answers.csv", answerKey, "Math");

		// PriorityQueue for ranking
		PriorityQueue<StudentResult> ranking = new PriorityQueue<>();

		// Load scores into queue
		scores.forEach((name, score) -> ranking.add(new StudentResult(name, score)));

		// Display ranked results
		System.out.println("\n--- Exam Results ---");
		while (!ranking.isEmpty()) {
			StudentResult r = ranking.poll();
			System.out.println(r.name + " → Score: " + r.score);
		}
	}
}