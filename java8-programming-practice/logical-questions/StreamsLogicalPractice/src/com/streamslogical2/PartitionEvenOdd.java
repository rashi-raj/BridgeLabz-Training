package com.streamslogical2;
import java.util.*;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Map<Boolean, List<Integer>> result =
                list.stream()
                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even : " + result.get(true));
        System.out.println("Odd  : " + result.get(false));
    }
}
