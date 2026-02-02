package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

public class KeepFirstDuplicate {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "api", "java");

        Map<String, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> s.length(),
                            (first, duplicate) -> first
                    ));

        System.out.println(map);
    }
}
