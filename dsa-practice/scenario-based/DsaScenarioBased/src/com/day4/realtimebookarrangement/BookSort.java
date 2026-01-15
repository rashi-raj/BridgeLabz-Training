package com.day4.realtimebookarrangement;

public class BookSort {
	void sort(String book[]) {
		for(int i=1 ; i<book.length ; i++) {
			int j = i-1;
			String key = book[i];
			while (j >= 0 && book[j].compareTo(key) > 0) {
                book[j + 1] = book[j];
                j--;
            }
            book[j + 1] = key;
		}
	}
	
	void display(String book[]) {
		System.out.println("Sorted Book -> ");
		for(int i=0 ; i<book.length ; i++) {
			System.out.println(book[i]);
		}
	}
}
