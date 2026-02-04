package com.librarymanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
	
	private static LibraryCatalog instance;
	List<Book> bookList = new ArrayList<>();
	List<TrackUser> track = new ArrayList<>();
	
	private LibraryCatalog() {}
	
	public static LibraryCatalog getInstance() {
		if(instance==null) {
			instance = new LibraryCatalog();
		}
		return instance;
	}
	
	//add book to book list
	public void addBooks(Book book) {
		bookList.add(book);
		getNotifiedUsers(book.getTitle());
	}
	
	//add user to track list
	public void addUser(TrackUser user) {
		track.add(user);
	}
	
	//remove user to track list
	public void removeUser(TrackUser user) {
		track.remove(user);
	}
	
	//get notified to user by track
	public void getNotifiedUsers(String newBooks) {
		for(TrackUser u : track) {
			u.getNotified("New Book Available: "+newBooks);
		}
	}
}
