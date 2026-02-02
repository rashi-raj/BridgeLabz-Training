package com.streamslogical2;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates =
                list.stream()
                    .filter(n -> !seen.add(n))
                    .distinct()
                    .collect(Collectors.toList());

        System.out.println(duplicates);
    }
}
