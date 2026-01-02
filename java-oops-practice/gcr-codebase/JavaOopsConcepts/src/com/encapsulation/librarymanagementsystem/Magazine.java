package com.encapsulation.librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable {

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7; // 7 days
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
