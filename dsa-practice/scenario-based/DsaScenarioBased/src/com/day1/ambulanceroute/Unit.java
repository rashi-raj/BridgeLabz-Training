package com.day1.ambulanceroute;

class Unit {
    String name;
    boolean available;
    Unit next;

    Unit(String name) {
        this.name = name;
        this.available = true;
        this.next = null;
    }
}
