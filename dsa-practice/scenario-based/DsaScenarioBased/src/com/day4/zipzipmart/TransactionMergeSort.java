package com.day4.zipzipmart;

import java.util.List;
import java.util.ArrayList;

public class TransactionMergeSort {

    public void mergeSort(List<Transaction> list) {

        if (list.size() <= 1)
            return;

        int mid = list.size() / 2;

        List<Transaction> left = new ArrayList<>(list.subList(0, mid));
        List<Transaction> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private void merge(List<Transaction> list,
                       List<Transaction> left,
                       List<Transaction> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            Transaction t1 = left.get(i);
            Transaction t2 = right.get(j);

            if (t1.date.isBefore(t2.date) ||
               (t1.date.equals(t2.date) && t1.amount <= t2.amount)) {

                list.set(k++, t1); 
                i++;

            } else {
                list.set(k++, t2);
                j++;
            }
        }

        while (i < left.size())
            list.set(k++, left.get(i++));

        while (j < right.size())
            list.set(k++, right.get(j++));
    }
}
