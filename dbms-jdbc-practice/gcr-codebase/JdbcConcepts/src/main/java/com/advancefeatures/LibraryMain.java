package com.advancefeatures;

public class LibraryMain {

    public static void main(String[] args) {

    	AdvancedFeatures lib = new AdvancedFeatures();

        try {
            // 1️ Create tables
            lib.createTables();

            // 2️ Issue a book
            lib.issueBook(1, 101);   // studentId = 1, bookId = 101

            // 3️ Search books (multiple filters)
            System.out.println("\nAvailable Java Books:");
            lib.searchBooks("James Gosling", "Programming");

            // 4️ Return book (record_id from borrow_records)
            lib.returnBook(1);

            // 5️ Search again after return
            System.out.println("\nBooks after return:");
            lib.searchBooks(null, "Programming");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}