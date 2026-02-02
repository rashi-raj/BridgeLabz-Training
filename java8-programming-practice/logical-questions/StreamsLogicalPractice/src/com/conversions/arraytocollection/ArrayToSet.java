package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class ArrayToSet {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A", "C"};

        Set<String> set = Arrays.stream(arr)
                                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
