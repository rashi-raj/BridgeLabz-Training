package com.linkedlist.doublylinkedlist.librarymanagementsystem;

class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    /* Add at Beginning */
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    /* Add at End */
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    /* Add at Specific Position (1-based index) */
    public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode node = new BookNode(id, title, author, genre, available);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    /* Remove by Book ID */
    public void removeByBookId(int bookId) {

        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully");
    }

    /* Search by Title */
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displaySingle(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found with title: " + title);
    }

    /* Search by Author */
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displaySingle(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found by author: " + author);
    }

    /* Update Availability */
    public void updateAvailability(int bookId, boolean available) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = available;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    /* Display Forward */
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displaySingle(temp);
            temp = temp.next;
        }
    }

    /* Display Reverse */
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displaySingle(temp);
            temp = temp.prev;
        }
    }

    /* Count Total Books */
    public void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books: " + count);
    }

    private void displaySingle(BookNode b) {
        System.out.println("ID: " + b.bookId +
                ", Title: " + b.title +
                ", Author: " + b.author +
                ", Genre: " + b.genre +
                ", Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}
