package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapToKeyValueStringList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Apple", 2, "Banana");

        List<String> list = map.entrySet()
                               .stream()
                               .map(e -> e.getKey() + "=" + e.getValue())
                               .collect(Collectors.toList());

        System.out.println(list);
    }
}
