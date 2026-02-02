package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class ListToLinkedHashSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C");

        Set<String> linkedSet = list.stream()
                                    .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(linkedSet);
    }
}
