package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class ListToSetWithFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        Set<Integer> evenSet = list.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toSet());

        System.out.println(evenSet);
    }
}
