package com.day7.pharmacyinventorysystem;

import java.time.LocalDate;

class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate.minusDays(5));
    }
}
