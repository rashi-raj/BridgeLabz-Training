package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

public class StringToLengthMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "spring", "api");

        Map<String, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(
                            s -> s,
                            s -> s.length()
                    ));

        System.out.println(map);
    }
}
