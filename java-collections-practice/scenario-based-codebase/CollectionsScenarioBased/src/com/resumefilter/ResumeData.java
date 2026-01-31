package com.resumefilter;

public class ResumeData {

	String email;
	String phone;
	int keywordCount;
	String fileName;

	public ResumeData(String email, String phone, int keywordCount, String fileName) {
		this.email = email;
		this.phone = phone;
		this.keywordCount = keywordCount;
		this.fileName = fileName;
	}

	public String toString() {
		return fileName + " | Email: " + email + " | Phone: " + phone + " | Skill Matches: " + keywordCount;
	}
}