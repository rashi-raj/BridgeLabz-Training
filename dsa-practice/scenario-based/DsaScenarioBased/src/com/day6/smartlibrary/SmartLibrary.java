package com.day6.smartlibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> borrowedBooks = new ArrayList<>();
        BookSorter sorter = new BookSorter();

        System.out.print("Enter number of books to issue: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter book title " + i + ": ");
            String title = sc.nextLine();

            sorter.insertAlphabetically(borrowedBooks, title);

            System.out.println("Current sorted list:");
            System.out.println(borrowedBooks);
        }

        sc.close();
    }
}
