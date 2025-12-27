package com.constructorandaccessmodifiers.level1;

public class LibraryBookSystem {

	String title;
	String author;
	int price;
	boolean availability;
	
	LibraryBookSystem() {
		title = "Godan";
		author = "Premchandra";
		price = 350;
		availability = true;
	}
	LibraryBookSystem(String title, String author, int price, boolean availability) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	void borrowBook() {
		if (availability) {
			System.out.println("Book is Available And details are : ");
			System.out.println("Title name: " + title);
			System.out.println("Author name: " + author);
			System.out.println("Price: " + price);
		}
		else {
			System.out.println("Book is not Available");
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Default Constructor
		LibraryBookSystem book1 = new LibraryBookSystem();
        System.out.println("Book 1:");
        book1.borrowBook();
        // Parameterized Constructor
        LibraryBookSystem book2 = new LibraryBookSystem("Gunah", "Dharm", 200, false);
        System.out.println("Book 2:");
        book2.borrowBook();
	}


}
