package com.feedbackguru;

import java.util.*;

//Main application class
public class FeedbackGuruApp {

	public static void main(String[] args) {

		// Reads all feedback from folder
		List<String> feedbackLines = FeedbackReader.readFeedbackFiles("feedbacks");

		// Analyzes feedback for Service type
		Map<String, List<Feedback<String>>> result = FeedbackAnalyzer.analyze(feedbackLines, "Service");

		// Displays categorized feedback
		for (String category : result.keySet()) {
			System.out.println("\n" + category + " Feedback:");
			result.get(category).forEach(System.out::println);
		}
	}
}