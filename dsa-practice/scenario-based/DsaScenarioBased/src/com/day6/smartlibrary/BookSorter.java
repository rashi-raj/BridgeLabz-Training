package com.day6.smartlibrary;

import java.util.ArrayList;

public class BookSorter {
	 public void insertAlphabetically(ArrayList<String> books, String newBook) {

	        int i = books.size() - 1;

	        while (i >= 0 && books.get(i).compareToIgnoreCase(newBook) > 0) {
	            i--;
	        }

	        books.add(i + 1, newBook);
	    }
}
