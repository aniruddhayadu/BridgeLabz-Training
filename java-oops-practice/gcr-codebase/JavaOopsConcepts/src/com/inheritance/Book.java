package com.inheritance;

public class Book {
	protected String title;
	protected int publicationYear;
	Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	void displayInfo() {
		System.out.println("Book title is :"+title);
		System.out.println("Book Publication Year is :"+publicationYear);
	}
}
