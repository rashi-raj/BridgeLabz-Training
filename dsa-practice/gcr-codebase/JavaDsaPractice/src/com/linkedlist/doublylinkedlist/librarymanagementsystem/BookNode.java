package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class BookNode {

    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode prev;
    BookNode next;

    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
