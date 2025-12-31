package com.objectmodeling;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayLibraryBooks() {
        for (Book book : books) {
            book.displayBook();
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {

        // Books created independently
        Book b1 = new Book("Godan", "Premchand");
        Book b2 = new Book("Gunah", "Dharm");

        // Library object
        Library library = new Library();

        // Adding books to library
        library.addBook(b1);
        library.addBook(b2);

        // Display books in library
        library.displayLibraryBooks();
    }
}
