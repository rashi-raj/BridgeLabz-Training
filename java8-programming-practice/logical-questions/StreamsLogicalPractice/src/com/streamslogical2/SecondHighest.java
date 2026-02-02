package com.streamslogical2;
import java.util.Arrays;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 40, 30, 20);

        int secondHighest =
                list.stream()
                    .distinct()
                    .sorted((a, b) -> b - a)   // descending
                    .skip(1)
                    .findFirst()
                    .orElseThrow();

        System.out.println(secondHighest);
    }
}
