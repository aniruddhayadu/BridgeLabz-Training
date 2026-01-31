package com.resumefilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ResumeReader {

	public static String readResume(File file) throws IOException {

		if (!file.getName().endsWith(".txt") && !file.getName().endsWith(".pdf")) {
			throw new IOException("Invalid resume format");
		}

		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder content = new StringBuilder();
		String line;

		while ((line = br.readLine()) != null) {
			content.append(line).append(" ");
		}

		br.close();
		return content.toString();
	}
}