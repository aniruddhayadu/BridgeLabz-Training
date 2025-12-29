package com.constructorandaccessmodifiers.level1;

class EBook extends LibraryBook {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);          // public
        System.out.println("Title: " + title);        // protected
        System.out.println("Author: " + getAuthor()); // private via getter
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-0135166307", "Java Programming", "James Gosling");
        ebook.displayDetails();

        ebook.setAuthor("Oracle Team");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
