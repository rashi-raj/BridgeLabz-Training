package com.constructor.level1;

public class BookMain {
	 public static void main(String[] args) {

	     // Using default constructor
	     Book book1 = new Book();
	     book1.displayDetails();

	     System.out.println();

	     // Using parameterized constructor
	     Book book2 = new Book("Java Programming", "James Gosling", 599.50);
	     book2.displayDetails();
	 }
}
