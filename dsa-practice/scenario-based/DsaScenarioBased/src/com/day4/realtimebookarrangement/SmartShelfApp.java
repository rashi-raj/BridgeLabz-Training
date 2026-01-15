package com.day4.realtimebookarrangement;

import java.util.Scanner;

public class SmartShelfApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books : ");
		int n = sc.nextInt();
		sc.nextLine();
		String book[] = new String[n];
		for(int i=0 ; i<n ; i++) {
			System.out.println("Book-" + (i+1) + " Title : ");
			book[i] = sc.nextLine();
		}
		
		BookSort b = new BookSort();
		b.sort(book);
		b.display(book);
		
		sc.close();
	}
}
