package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class ArrayToDistinctList {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 3, 4};

        List<Integer> list = Arrays.stream(arr)
                                   .distinct()
                                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
