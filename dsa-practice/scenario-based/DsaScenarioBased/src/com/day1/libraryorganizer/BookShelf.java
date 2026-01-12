package com.day1.libraryorganizer;

import java.util.*;

class BookShelf {

    HashMap<String, LinkedList<Book>> library = new HashMap<>();
    HashSet<Integer> bookIds = new HashSet<>();

    void addBook(String genre, Book book) {

        if (bookIds.contains(book.id)) {
            System.out.println("Book already exists!");
            return;
        }

        LinkedList<Book> list = library.getOrDefault(genre, new LinkedList<>());
        list.add(book);
        library.put(genre, list);
        bookIds.add(book.id);

        System.out.println("Book added successfully.");
    }

    void borrowBook(String genre, int id) {

        if (!library.containsKey(genre)) {
            System.out.println("Genre not found!");
            return;
        }

        Iterator<Book> it = library.get(genre).iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.id == id) {
                it.remove();
                bookIds.remove(id);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    void returnBook(String genre, Book book) {
        addBook(genre, book);
    }

    void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (String genre : library.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : library.get(genre)) {
                System.out.println(b);
            }
        }
    }
}
