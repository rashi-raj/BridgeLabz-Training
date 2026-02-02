package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapSortedByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(3, "C", 1, "A", 2, "B");

        List<Map.Entry<Integer, String>> sorted =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByKey())
                   .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
