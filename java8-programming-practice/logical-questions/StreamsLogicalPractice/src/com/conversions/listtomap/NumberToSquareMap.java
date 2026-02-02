package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

public class NumberToSquareMap {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        Map<Integer, Integer> map =
                list.stream()
                    .collect(Collectors.toMap(
                            n -> n,
                            n -> n * n
                    ));

        System.out.println(map);
    }
}
