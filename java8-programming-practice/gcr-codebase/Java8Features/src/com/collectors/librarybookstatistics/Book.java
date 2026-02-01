package com.collectors.librarybookstatistics;

public class Book {
    private String genre;
    private int pages;

    public Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}
