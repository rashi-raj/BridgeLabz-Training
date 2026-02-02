package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapValuesToList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Java", 2, "Python");

        List<String> values = map.values()
                                 .stream()
                                 .collect(Collectors.toList());

        System.out.println(values);
    }
}
