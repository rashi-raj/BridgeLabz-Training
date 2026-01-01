package com.inheritance.singleinheritance.librarymanagement;

public class Book {
	protected String title;
	protected int year;
	
	Book(String title, int year){
		this.title = title;
		this.year = year;
	}
	
	void displayInfo() {
		System.out.println("Book title : " + title);
		System.out.println("Published Year : " + year);
	}
}
