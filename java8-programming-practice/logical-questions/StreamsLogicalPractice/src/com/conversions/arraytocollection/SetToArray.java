package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class SetToArray {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3, 4);

        Integer[] arr = set.stream()
                           .toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
