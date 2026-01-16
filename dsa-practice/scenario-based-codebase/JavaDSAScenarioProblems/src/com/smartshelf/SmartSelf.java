package com.smartshelf;
import java.util.ArrayList;

public class SmartSelf {

	static Book [] bookSelf = new Book[8];
	static int numberOfBooks = 0;
	static void addBook(String title, String author) {
		Book book = new Book(title, author);
		
		bookSelf[numberOfBooks++] = book;
		
		
	}
	
	static void sortBook() {

		for (int i = 1; i < bookSelf.length; ++i) {

			int j = i - 1;
			Book key = bookSelf[i];

			while (j >= 0 && ((bookSelf[j].title.compareTo(key.title)) > 0)) {
//	        	
				bookSelf[j + 1] = bookSelf[j];
				j--;
			}
			bookSelf[j + 1] = key;
		}

	}
	static void displayBook() {
		System.out.println("\nDisplaying books in self\n");
		for (int i = 0; i < bookSelf.length; i++) {

			System.out.println("Title -> " + bookSelf[i].title);

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addBook("Godan", "Munshi Premchandra");
		addBook("Gunaho ka Devta", "Dharmvir Bharti");
		addBook("Chitralekha","Bhagwati Charan Verma");
		addBook("Deewar me ek Khidki Rehti thi", "Vinod Kumar Shukla");
		addBook("Raag Darbari", "Shree Laal");
		addBook("Tamas", "Bhisma Sahini");
		addBook("Aapka Banti", "Mannu Bhandari");
		addBook("Karmabhoomi", "Munshi Premchandra");
		
		System.out.println("Books in Unsorted Order");
		displayBook();
		
		System.out.println();
		sortBook();
		
		System.out.println("Books in Sorted Order");
		displayBook();
	}

}
