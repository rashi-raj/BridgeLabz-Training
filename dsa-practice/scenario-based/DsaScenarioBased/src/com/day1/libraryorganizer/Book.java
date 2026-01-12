package com.day1.libraryorganizer;

class Book {
    int id;
    String name;
    String author;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return id + " | " + name + " | " + author;
    }
}
