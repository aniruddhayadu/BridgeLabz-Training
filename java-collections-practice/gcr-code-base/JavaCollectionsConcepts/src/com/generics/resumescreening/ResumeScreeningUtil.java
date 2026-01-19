package com.generics.resumescreening;

public class ResumeScreeningUtil {

	// Generic method to screen a resume
	public static <T extends JobRole> boolean screenResume(Resume<T> resume) {

		// Check if candidate meets experience requirement
		return resume.getExperience() >= resume.getJobRole().getMinExperience();
	}
}
