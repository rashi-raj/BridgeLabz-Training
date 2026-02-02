package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapEntriesToList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "One", 2, "Two");

        List<Map.Entry<Integer, String>> entries =
                map.entrySet()
                   .stream()
                   .collect(Collectors.toList());

        System.out.println(entries);
    }
}
