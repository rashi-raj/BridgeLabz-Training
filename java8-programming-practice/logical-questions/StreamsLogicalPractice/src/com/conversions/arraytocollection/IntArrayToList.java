package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class IntArrayToList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        List<Integer> list = Arrays.stream(arr)
                                   .boxed()
                                   .collect(Collectors.toList());

        System.out.println(list);
    }
}
