package com.collectors.librarybookstatistics;

public class Book {
	private String title;
	private String genre;
	private int pages;

	public Book(String title, String genre, int pages) {
		this.title = title;
		this.genre = genre;
		this.pages = pages;
	}

	public String getGenere() {
		return genre;
	}

	public int getBookPage() {
		return pages;
	}
}