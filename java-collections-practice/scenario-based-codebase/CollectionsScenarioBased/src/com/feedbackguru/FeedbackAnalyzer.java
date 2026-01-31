package com.feedbackguru;

import java.util.*;
import java.util.regex.*;

// Analyzes feedback and categorizes it
public class FeedbackAnalyzer {

	// Categorizes feedback into Positive, Neutral, Negative
	public static <T> Map<String, List<Feedback<T>>> analyze(List<String> lines, T type) {

		// Map to store categorized feedback
		Map<String, List<Feedback<T>>> categories = new HashMap<>();

		categories.put("Positive", new ArrayList<>());
		categories.put("Neutral", new ArrayList<>());
		categories.put("Negative", new ArrayList<>());

		// Regex to extract rating like 9/10 or 7/10
		Pattern pattern = Pattern.compile("(\\d{1,2})/10");

		// Processes each feedback line
		for (String line : lines) {
			try {
				Matcher matcher = pattern.matcher(line); // Applies regex

				// If rating exists
				if (matcher.find()) {

					int rating = Integer.parseInt(matcher.group(1)); // Extracts rating

					Feedback<T> feedback = new Feedback<>(type, line, rating); // Creates feedback object

					// Categorizes based on rating
					if (rating >= 8) {
						categories.get("Positive").add(feedback);
					} else if (rating >= 5) {
						categories.get("Neutral").add(feedback);
					} else {
						categories.get("Negative").add(feedback);
					}
				}
			} catch (Exception e) {
				// Handles invalid or malformed feedback line
				System.out.println("Skipping invalid feedback: " + line);
			}
		}

		return categories; // Returns categorized feedback
	}
}