package com.librarymanagementsystem;

public class Book {
	private String title;
	private String author;
	private int edition;
	private String genre;
	
	public Book(Builder build) {
		this.title = build.title;
		this.author = build.author;
		this.edition = build.edition;
		this.genre = build.genre;
	}
	
	public static class Builder{
		private String title;
		private String author;
		private int edition;
		private String genre;
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		
		public Builder edition(int edition) {
			this.edition = edition;
			return this;
		}
		
		public Builder genre(String genre) {
			this.genre = genre;
			return this;
		}
		
		public Book build() {
			return new Book(this);
		}
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", edition=" + edition + ", genre=" + genre + "]";
	}
}
