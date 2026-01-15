package com.day4.examcell;

import java.util.ArrayList;
import java.util.List;

public class StudentMergeSort {

    public void mergeSort(List<Student> list) {

        if (list.size() <= 1) return;

        int mid = list.size() / 2;

        List<Student> left = new ArrayList<>(list.subList(0, mid));
        List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private void merge(List<Student> list,
                       List<Student> left,
                       List<Student> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            if (left.get(i).score >= right.get(j).score) {
                list.set(k++, left.get(i++)); 
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size())
            list.set(k++, left.get(i++));

        while (j < right.size())
            list.set(k++, right.get(j++));
    }
}
