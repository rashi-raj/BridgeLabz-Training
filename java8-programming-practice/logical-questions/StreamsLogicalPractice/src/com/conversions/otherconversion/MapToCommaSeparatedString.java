package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class MapToCommaSeparatedString {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "A", 2, "B", 3, "C");

        String result = map.entrySet()
                           .stream()
                           .map(e -> e.getKey() + "=" + e.getValue())
                           .collect(Collectors.joining(","));

        System.out.println(result); // 1=A,2=B,3=C
    }
}
