package com.inheritance;

public class Author extends Book {
	private String authorName;
	Author(String title, int publicationYear, String authorName) {
		super(title, publicationYear);
		this.authorName = authorName;
	}
	
	void displayInfo() {
		super.displayInfo();
		System.out.println("Auther Name is :"+authorName);
	}
}
