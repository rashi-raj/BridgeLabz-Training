package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapKeysToList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "A", 2, "B", 3, "C");

        List<Integer> keys = map.keySet()
                                .stream()
                                .collect(Collectors.toList());

        System.out.println(keys);
    }
}
