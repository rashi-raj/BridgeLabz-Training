package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class ListToGroupedMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado");

        Map<Character, List<String>> grouped = list.stream()
                                                   .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(grouped); // {a=[apple, avocado], b=[banana]}
    }
}
