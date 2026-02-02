package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class ArrayToList {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};

        List<Integer> list = Arrays.stream(arr)
                                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
