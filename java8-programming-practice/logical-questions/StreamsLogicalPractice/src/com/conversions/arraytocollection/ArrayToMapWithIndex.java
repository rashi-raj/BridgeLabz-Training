package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class ArrayToMapWithIndex {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};

        Map<Integer, String> map = IntStream.range(0, arr.length)
                                            .boxed()
                                            .collect(Collectors.toMap(i -> i, i -> arr[i]));

        System.out.println(map);
    }
}
