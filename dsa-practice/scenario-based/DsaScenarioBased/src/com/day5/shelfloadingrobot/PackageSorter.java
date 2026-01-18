package com.day5.shelfloadingrobot;

import java.util.ArrayList;

public class PackageSorter {

    public void insertInSortedOrder(ArrayList<Integer> shelf, int weight) {

        int i = shelf.size() - 1;

        // Shift heavier packages to the right
        while (i >= 0 && shelf.get(i) > weight) {
            i--;
        }

        shelf.add(i + 1, weight);
    }
}
