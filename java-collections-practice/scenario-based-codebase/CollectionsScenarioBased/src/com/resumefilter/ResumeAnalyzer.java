package com.resumefilter;

import java.io.File;
import java.util.*;

// Main Resume Analyzer system
public class ResumeAnalyzer {

	public static void main(String[] args) {

		File resumeFolder = new File("resumes");

		Map<String, ResumeData> resumeIndex = new HashMap<>();
		List<ResumeData> sortedCandidates = new ArrayList<>();

		for (File file : Objects.requireNonNull(resumeFolder.listFiles())) {

			try {
				String content = ResumeReader.readResume(file);

				String email = RegexUtil.extractEmail(content);
				String phone = RegexUtil.extractPhone(content);
				int skillCount = RegexUtil.countSkills(content);

				// Skip resumes without valid email
				if (email == null) {
					throw new Exception("Invalid resume: Email missing");
				}

				ResumeData data = new ResumeData(email, phone, skillCount, file.getName());

				resumeIndex.put(email, data);
				sortedCandidates.add(data);

			} catch (Exception e) {
				System.out.println("Skipping file: " + file.getName() + " | Reason: " + e.getMessage());
			}
		}

		// Sort candidates by skill match count (descending)
		sortedCandidates.sort((a, b) -> Integer.compare(b.keywordCount, a.keywordCount));

		System.out.println("\n===== Shortlisted Candidates =====");
		for (ResumeData r : sortedCandidates) {
			System.out.println(r);
		}
	}
}