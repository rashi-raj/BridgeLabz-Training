package com.streamslogical2;
import java.util.*;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "ccc", "dd");

        Map<Integer, List<String>> result =
                list.stream()
                    .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}
