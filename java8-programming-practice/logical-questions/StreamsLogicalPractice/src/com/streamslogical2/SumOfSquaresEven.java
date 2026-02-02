package com.streamslogical2;
import java.util.*;

public class SumOfSquaresEven {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int result =
                list.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(n -> n * n)
                    .sum();

        System.out.println(result); // 20
    }
}
