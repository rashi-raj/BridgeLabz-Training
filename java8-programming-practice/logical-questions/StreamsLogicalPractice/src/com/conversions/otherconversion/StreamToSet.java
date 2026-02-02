package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class StreamToSet {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 2, 3);

        Set<Integer> set = stream.collect(Collectors.toSet());

        System.out.println(set);
    }
}
