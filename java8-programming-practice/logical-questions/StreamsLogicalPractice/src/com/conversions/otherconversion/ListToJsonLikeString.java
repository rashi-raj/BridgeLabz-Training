package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class ListToJsonLikeString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        String json = list.stream()
                          .map(s -> "\"" + s + "\"")
                          .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(json); // ["A","B","C"]
    }
}
