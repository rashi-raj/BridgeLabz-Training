package com.streamslogical2;
import java.util.*;

public class KthSmallest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9, 1, 5, 3, 7);
        int k = 2;

        int result =
                list.stream()
                    .sorted()
                    .skip(k - 1)
                    .findFirst()
                    .orElseThrow();

        System.out.println(result); // 3
    }
}
