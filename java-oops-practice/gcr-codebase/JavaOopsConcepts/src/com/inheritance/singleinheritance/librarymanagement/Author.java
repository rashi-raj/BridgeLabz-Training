package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
	private String name;
	private String bio;
	
	Author(String name, String bio, String title, int year){
		super(title, year);
		this.name = name;
		this.bio = bio;
	}
	
	void displayInfo() {
		System.out.println("Author's name : " + name);
		System.out.println("Bio : " + bio);
		super.displayInfo();
	}
	
}
