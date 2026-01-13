package com.browserbuddy;

public class Page {
	String currentPage;
	Page next;
	Page prev;
	
	//Constructor
	public Page(String currentPage) {
		super();
		this.currentPage = currentPage;
		this.next = null;
		this.prev = null;
	}
	
}
