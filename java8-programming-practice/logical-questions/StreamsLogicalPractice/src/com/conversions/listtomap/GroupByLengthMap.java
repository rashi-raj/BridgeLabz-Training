package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByLengthMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "ccc", "dd");

        Map<Integer, List<String>> map =
                list.stream()
                    .collect(Collectors.groupingBy(String::length));

        System.out.println(map);
    }
}
