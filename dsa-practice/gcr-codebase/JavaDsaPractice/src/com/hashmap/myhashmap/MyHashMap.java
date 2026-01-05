package com.hashmap.myhashmap;

import java.util.*;

class MyHashMap {
    private static class Entry {
        int key, value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 5;
    private Entry[] table = new Entry[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);

        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry curr = table[index];
            while (curr.next != null) {
                if (curr.key == key) {
                    curr.value = value;
                    return;
                }
                curr = curr.next;
            }
            curr.next = newEntry;
        }
    }

    public Integer get(int key) {
        int index = hash(key);
        Entry curr = table[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Entry curr = table[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) table[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}