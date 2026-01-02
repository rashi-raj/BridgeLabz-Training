package com.encapsulation.librarymanagementsystem;

class Book extends LibraryItem implements Reservable {

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        reserve(borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
