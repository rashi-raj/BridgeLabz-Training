package com.streamslogical2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan50 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 55, 60, 23, 90);

        List<Integer> result =
                list.stream()
                    .filter(n -> n > 50)
                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
