package com.streamslogical2;
import java.util.*;
import java.util.stream.Collectors;

public class TopThreeNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,90,30,70,50);

        List<Integer> result =
                list.stream()
                    .sorted(Comparator.reverseOrder())
                    .limit(3)
                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
