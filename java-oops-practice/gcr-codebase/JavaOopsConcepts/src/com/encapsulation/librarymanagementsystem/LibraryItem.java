package com.encapsulation.librarymanagementsystem;

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Encapsulated sensitive data
    private String borrowerName;
    private boolean isAvailable = true;

    // Constructor
    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    abstract int getLoanDuration(); // in days

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Protected methods for subclasses
    protected void reserve(String borrower) {
        if (isAvailable) {
            this.borrowerName = borrower;
            this.isAvailable = false;
        }
    }

    protected boolean isAvailable() {
        return isAvailable;
    }
}
