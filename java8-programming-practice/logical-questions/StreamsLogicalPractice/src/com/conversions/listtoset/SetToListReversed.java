package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class SetToListReversed {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 3, 2, 5);

        List<Integer> reversedList = set.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

        System.out.println(reversedList);
    }
}
