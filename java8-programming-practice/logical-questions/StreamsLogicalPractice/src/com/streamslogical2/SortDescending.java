package com.streamslogical2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class SortDescending {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 1, 9, 3);

        List<Integer> result =
                list.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
