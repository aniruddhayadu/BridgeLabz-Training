package com.constructorandaccessmodifiers.level1;

public class LibraryBook {

    public String ISBN;          // public
    protected String title;      // protected
    private String author;       // private

    // Constructor
    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }
}
