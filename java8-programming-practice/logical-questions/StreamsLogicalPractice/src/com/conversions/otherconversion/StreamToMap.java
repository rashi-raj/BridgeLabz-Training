package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class StreamToMap {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Alice", "Bob", "Charlie");

        Map<String, Integer> map = stream.collect(Collectors.toMap(s -> s, s -> s.length()));

        System.out.println(map);
    }
}
