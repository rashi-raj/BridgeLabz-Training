package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class MapFilterByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "B", 50, "C", 30);

        int N = 20;

        List<Map.Entry<String, Integer>> result =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() > N)
                   .collect(Collectors.toList());

        System.out.println(result);
    }
}
