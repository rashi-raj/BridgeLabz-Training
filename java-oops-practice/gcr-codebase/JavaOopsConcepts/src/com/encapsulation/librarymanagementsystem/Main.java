package com.encapsulation.librarymanagementsystem;

public class Main {

    static void processItem(LibraryItem item) {

        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        if (item instanceof Reservable) {
            System.out.println("Available for Reservation: " + (((Reservable) item).checkAvailability() ? "Yes" : "No"));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LibraryItem item1 = new Book(101, "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine(102, "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD(103, "Inception", "Christopher Nolan");

        // Reserve one item
        ((Reservable) item1).reserveItem("Amit");

        LibraryItem[] items = { item1, item2, item3 };

        for (LibraryItem item : items) {
            processItem(item);
        }
    }
}

