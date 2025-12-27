package com.constructorandaccessmodifiers.level1;

public class Book {
	private String title;
	private String author;
	private int price;
	
	Book() {
		title = "Godan";
		author = "Premchandra";
		price = 350;
	}
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayBookDetails() {
        System.out.println("Title name: " + title);
        System.out.println("Author name: " + author);
        System.out.println("Price: " + price);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Default Constructor
        Book book1 = new Book();
        System.out.println("Book 1:");
        book1.displayBookDetails();
        // Parameterized Constructor
        Book book2 = new Book("Gunah", "Dharm", 200);
        System.out.println("Book 2:");
        book2.displayBookDetails();
	}

}
