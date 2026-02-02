package com.conversions.arraytocollection;
import java.util.*;
import java.util.stream.*;

class ListToArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");

        String[] arr = list.stream()
                           .toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
