package com.day3.deliverychainmanagement;

public class Stage {
    String name;
    Stage next;

    Stage(String name) {
        this.name = name;
        this.next = null;
    }
}
