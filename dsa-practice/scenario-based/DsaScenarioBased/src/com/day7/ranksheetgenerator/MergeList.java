package com.day7.ranksheetgenerator;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

    // Merge two sorted lists
    public static List<Student> merge(List<Student> a, List<Student> b) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).score > b.get(j).score) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }
}