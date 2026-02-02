package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class SetToList {
    public static void main(String[] args) {
        Set<String> set = Set.of("Java", "Python", "C++");

        List<String> list = set.stream()
                               .collect(Collectors.toList());

        System.out.println(list);
    }
}
