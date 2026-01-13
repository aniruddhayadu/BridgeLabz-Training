package com.bookshelf;

public class BookSelfApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object of BookArrangement
		BookArrangement lib = new BookArrangement();
		
		//Adding books to library book self
		lib.addBook("The Alchemist","Paulo Coelho","Fiction");
		lib.addBook("To Kill a Mockingbird","Harper Lee","Fiction");
		lib.addBook("1984","George Orwell","Dystopian");
		lib.addBook("Brave New World","Aldous Huxley","Dystopian");
		lib.addBook("The Hobbit","J.R.R. Tolkien","Fantasy");
		lib.addBook("Harry Potter and the Sorcerer's Stone","J.K. Rowling","Fantasy");
		lib.addBook("The Lord of the Rings","J.R.R. Tolkien","Fantasy");
		lib.addBook("A Brief History of Time","Stephen Hawking","Science");
		lib.addBook("The Selfish Gene","Richard Dawkins","Science");
		lib.addBook("The Selfish Gene","Richard Dawkins","Science");
		lib.addBook("Clean Code","Robert C. Martin","Technology");
		lib.addBook("Introduction to Algorithms","Thomas H. Cormen","Technology");
		lib.addBook("The Lean Startup","Eric Ries","Business");
		lib.addBook("Rich Dad Poor Dad","Robert T. Kiyosaki","Business");
		lib.addBook("Atomic Habits","James Clear","Self-Help");
		lib.addBook("Think and Grow Rich","Napoleon Hill","Self-Help");
		lib.addBook("The Power of Habit","Charles Duhigg","Self-Help");
		lib.addBook("Sapiens","Yuval Noah Harari","History");
		lib.addBook("Guns, Germs, and Steel","Jared Diamond","History");
		lib.addBook("The Diary of a Young Girl","Anne Frank","Biography");
		lib.addBook("Long Walk to Freedom","Nelson Mandela","Biography");
		
		//Displaying books by Different Genre
		lib.displayBooksByGenre();
		
		//Borrowing Books from the library
		lib.borrowBook("Fiction","The Alchemist");
		lib.borrowBook("Fiction","To Kill a Mockingbird");
		lib.borrowBook("Dystopian","1984");
		lib.borrowBook("Fantasy","The Hobbit");
		lib.borrowBook("Fantasy","Harry Potter and the Sorcerer's Stone");
		lib.borrowBook("Science","A Brief History of Time");
		lib.borrowBook("Technology","Clean Code");
		lib.borrowBook("Self-Help","Atomic Habits");
		
		//Displaying book self after book borrowed
		lib.displayBooksByGenre();
		
		//Returning books 
		lib.returnBook("The Alchemist","Paulo Coelho","Fiction");
		lib.returnBook("To Kill a Mockingbird","Harper Lee","Fiction");
		lib.returnBook("1984","George Orwell","Dystopian");
		lib.returnBook("The Hobbit","J.R.R. Tolkien","Fantasy");
		lib.returnBook("Harry Potter and the Sorcerer's Stone","J.K. Rowling","Fantasy");
		lib.returnBook("A Brief History of Time","Stephen Hawking","Science");
		lib.returnBook("Clean Code","Robert C. Martin","Technology");
		lib.returnBook("Atomic Habits","James Clear","Self-Help");
		
		//Displaying book self after books returns
		lib.displayBooksByGenre();
	}
}
