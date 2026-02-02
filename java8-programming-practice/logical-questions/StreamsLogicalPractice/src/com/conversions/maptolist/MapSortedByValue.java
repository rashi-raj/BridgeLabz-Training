package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapSortedByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Z", 2, "A", 3, "M");

        List<Map.Entry<Integer, String>> sorted =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
