package com.encapsulation.librarymanagementsystem;

class DVD extends LibraryItem implements Reservable {

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; // 3 days
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
