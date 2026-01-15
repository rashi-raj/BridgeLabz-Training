package com.day4.zipzipmart;

import java.time.LocalDate;

public class Transaction {
    LocalDate date;
    double amount;

    public Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " -> Rs" + amount;
    }
}
