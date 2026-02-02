package com.streamslogical2;
import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

        Map<String, Integer> result =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toMap(
                           Map.Entry::getKey,
                           Map.Entry::getValue,
                           (a, b) -> a,
                           LinkedHashMap::new
                   ));

        System.out.println(result);
    }
}
