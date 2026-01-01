package com.inheritance.singleinheritance.librarymanagement;

public class Main {
	public static void main(String[] args) {
		Book book = new Author("Herbert Schildt","Herbert Schildt was a German Fallschirmjäger major and recipient of the Knight's Cross of the Iron Cross","Java Fundamentals",1998);
		
		book.displayInfo();
	}
}
