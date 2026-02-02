package com.conversions.otherconversion;
import java.util.*;
import java.util.stream.*;

class ListToCommaSeparatedString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        String result = list.stream()
                            .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
