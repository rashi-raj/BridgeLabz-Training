package com.streamslogical2;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {

        String s = "java is java and java is fast";

        Map<String, Long> result =
                Arrays.stream(s.split(" "))
                      .collect(Collectors.groupingBy(
                              w -> w,
                              LinkedHashMap::new,
                              Collectors.counting()
                      ));

        System.out.println(result);
    }
}
