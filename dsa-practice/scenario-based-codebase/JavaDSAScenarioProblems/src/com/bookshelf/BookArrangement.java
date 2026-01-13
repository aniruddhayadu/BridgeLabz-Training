package com.bookshelf;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class BookArrangement {

	

	private void displayBooks(BookNode book) {
		System.out.println("Title: " + book.title + ", Author: " + book.author + ", Genre: " + book.genre);
	}

	Set<String> bookList = new HashSet<>();
	Map<String, LinkedList<BookNode>> bookSelf = new HashMap<>();

	public void addBook(String title, String author, String genre) {

		if (bookList.contains(title)) {
			System.out.println("Book Already Exist in book self");
		} else {

			bookSelf.computeIfAbsent(genre, k -> new LinkedList<>()).add(new BookNode(title, author, genre));
			bookList.add(title);
			System.out.println("Book added Successfully");

		}
	}

	//Method to borrow books from library
	public void borrowBook(String genre, String title) {
		LinkedList<BookNode> booksInGenre = bookSelf.get(genre);

		if (booksInGenre == null) {
			System.out.println(genre + " not found");
			return;
		}
		

		boolean removed = booksInGenre.removeIf(book -> book.title.equals(title));

		if (removed) {
			System.out.println("Borrowed Successfully: '" + title + "' from " + genre + " genre.");
			// remove the genre entry from the map if the list becomes empty
			if (booksInGenre.isEmpty()) {
				bookSelf.remove(genre);
				System.out.println("Genre '" + genre + "' is now empty and has been borrowed from the library.");
			}
		} else {
			System.out.println("Book '" + title + "' not found in " + genre + " genre.");
		}

	}
	
	public void returnBook(String title, String author, String genre) {


			bookSelf.computeIfAbsent(genre, k -> new LinkedList<>()).add(new BookNode(title, author, genre));
			bookList.add(title);
			System.out.println("Book returned Successfully");

		
	}
	
	
	// Method to display all books
    public void displayBooksByGenre() {
        System.out.println("\nCurrent Library Collection:");
        if (bookSelf.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
        	System.out.println("--------------------------------------");
            for (Map.Entry<String, LinkedList<BookNode>> entry : bookSelf.entrySet()) {
                System.out.println("\n--- " + entry.getKey() + " ---");
                System.out.println("--------------------------------------");
                for (BookNode book : entry.getValue()) {
                    displayBooks(book);
                }
                System.out.println("--------------------------------------");
            }
        	System.out.println("--------------------------------------");

        }
    }
}
