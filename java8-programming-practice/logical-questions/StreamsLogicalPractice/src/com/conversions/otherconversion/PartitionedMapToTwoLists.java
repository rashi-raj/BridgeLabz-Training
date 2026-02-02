package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class PartitionedMapToTwoLists {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                         .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> even = partitioned.get(true);
        List<Integer> odd = partitioned.get(false);

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
