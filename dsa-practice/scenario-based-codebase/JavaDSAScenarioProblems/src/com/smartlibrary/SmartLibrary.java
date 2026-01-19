package com.smartlibrary;

public class SmartLibrary {
	
	// Initializing array to store object of books
	static int bookCount = 0;
	static Book[] bookSelf = new Book[bookCount];

	// Method to add books
	static void addBook(String title, String author, String genre) {

		Book book = new Book(title, author, genre);

		// Resize array
		Book[] temp = new Book[bookCount + 1];
		for (int i = 0; i < bookCount; i++) {
			temp[i] = bookSelf[i];
		}
		bookSelf = temp;

		// Insertion sort logic
		int j = bookCount - 1;

		while (j >= 0 && bookSelf[j].title.compareTo(book.title) > 0) {
			bookSelf[j + 1] = bookSelf[j];
			j--;
		}

		bookSelf[j + 1] = book;
		bookCount++; 

		System.out.println(bookCount + ") Book with title " + title + " added successfully");
	}

	// Method to display books
	static void displayBook() {
		System.out.println("\n\n------------------------------------");
		System.out.println("Displaying user borrowed books");
		System.out.println("------------------------------------");
		for (int i = 0; i < bookSelf.length; i++) {

			System.out.println("Title -> " + bookSelf[i].title);

		}
	}

	public static void main(String[] args) {

		// Adding books to library book self
		addBook("The Alchemist", "Paulo Coelho", "Fiction");
		addBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
		addBook("1984", "George Orwell", "Dystopian");
		addBook("Brave New World", "Aldous Huxley", "Dystopian");
		addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
		addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
		addBook("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
		addBook("A Brief History of Time", "Stephen Hawking", "Science");
		addBook("The Selfish Gene", "Richard Dawkins", "Science");
		addBook("The Selfish Gene", "Richard Dawkins", "Science");
		addBook("Clean Code", "Robert C. Martin", "Technology");
		addBook("Introduction to Algorithms", "Thomas H. Cormen", "Technology");
		addBook("The Lean Startup", "Eric Ries", "Business");
		
		
		// Displaying books before sorting
		displayBook();

	}

}
