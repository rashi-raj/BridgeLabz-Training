package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class GroupedMapToList {
    public static void main(String[] args) {
        Map<Character, List<String>> grouped = Map.of(
                'a', Arrays.asList("apple", "avocado"),
                'b', Arrays.asList("banana")
        );

        List<String> list = grouped.values()
                                   .stream()
                                   .flatMap(Collection::stream)
                                   .collect(Collectors.toList());

        System.out.println(list); // [apple, avocado, banana]
    }
}
