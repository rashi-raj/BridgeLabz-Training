package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(5, 1, 3, 2);

        List<Integer> sortedList = set.stream()
                                      .sorted()
                                      .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
