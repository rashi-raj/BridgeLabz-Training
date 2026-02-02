package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class StringArrayToList {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};

        List<String> list = Arrays.stream(arr)
                                  .collect(Collectors.toList());

        System.out.println(list);
    }
}
