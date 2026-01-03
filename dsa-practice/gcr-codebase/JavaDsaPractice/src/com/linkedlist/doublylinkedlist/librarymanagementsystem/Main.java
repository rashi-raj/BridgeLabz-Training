package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class Main {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning(101, "Java Basics", "James Gosling", "Programming", true);
        library.addAtEnd(102, "Clean Code", "Robert Martin", "Software Engineering", true);
        library.addAtPosition(2, 103, "Data Structures", "Mark Allen", "Computer Science", false);

        System.out.println("Library Books (Forward):");
        library.displayForward();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Robert Martin");

        library.updateAvailability(103, true);
        library.removeByBookId(101);

        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();

        library.countBooks();
    }
}
