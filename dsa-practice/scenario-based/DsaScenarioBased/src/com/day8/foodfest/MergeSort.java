package com.day8.foodfest;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    // Merge two already sorted lists (Descending order)
    public static List<Stall> merge(List<Stall> list1, List<Stall> list2) {

        List<Stall> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).customerCount >= list2.get(j).customerCount) {
                merged.add(list1.get(i++));   
            } else {
                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }

        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }

        return merged;
    }
}
