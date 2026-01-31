package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

// Evaluates exam answer sheets
public class ExamEvaluator {

	// Regex for valid CSV line (Name,A,B,C...)
	private static final Pattern LINE_PATTERN = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

	// Reads CSV and evaluates answers
	public static <T> Map<String, Integer> evaluate(String csvFile, List<String> answerKey, T subjectType) {

		Map<String, Integer> scores = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			String line;

			while ((line = br.readLine()) != null) {

				// 🔍 Format validation using regex
				if (!LINE_PATTERN.matcher(line).matches()) {
					System.out.println("Invalid format skipped: " + line);
					continue;
				}

				String[] parts = line.split(",");

				String name = parts[0];
				List<String> answers = Arrays.asList(Arrays.copyOfRange(parts, 1, parts.length));

				AnswerSheet<T> sheet = new AnswerSheet<>(name, answers, subjectType);

				int score = calculateScore(sheet.getAnswers(), answerKey);

				scores.put(sheet.getStudentName(), score);
			}

		} catch (IOException e) {
			System.out.println("Error reading CSV: " + e.getMessage());
		}

		return scores;
	}

	// Compares answers with key
	private static int calculateScore(List<String> studentAnswers, List<String> answerKey) {

		int score = 0;

		int size = Math.min(studentAnswers.size(), answerKey.size());

		for (int i = 0; i < size; i++) {
			if (studentAnswers.get(i).equals(answerKey.get(i))) {
				score++;
			}
		}

		return score;
	}
}
