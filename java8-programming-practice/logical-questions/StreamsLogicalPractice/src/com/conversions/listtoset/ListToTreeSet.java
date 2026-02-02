package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class ListToTreeSet {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 3, 2, 3);

        Set<Integer> treeSet = list.stream()
                                   .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(treeSet);
    }
}
