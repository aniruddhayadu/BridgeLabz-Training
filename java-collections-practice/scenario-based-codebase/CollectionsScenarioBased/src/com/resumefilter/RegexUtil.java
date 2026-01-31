package com.resumefilter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Utility class for regex extraction
public class RegexUtil {

	private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

	private static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{10}\\b");

	private static final Pattern SKILL_PATTERN = Pattern.compile("\\b(Java|Python|Spring)\\b",
			Pattern.CASE_INSENSITIVE);

	public static String extractEmail(String text) {
		Matcher m = EMAIL_PATTERN.matcher(text);
		return m.find() ? m.group() : null;
	}

	public static String extractPhone(String text) {
		Matcher m = PHONE_PATTERN.matcher(text);
		return m.find() ? m.group() : null;
	}

	public static int countSkills(String text) {
		Matcher m = SKILL_PATTERN.matcher(text);
		int count = 0;
		while (m.find())
			count++;
		return count;
	}
}
