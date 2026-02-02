package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class MapToListOfNames {
    public static void main(String[] args) {
        Map<Integer, Employee> map = Map.of(
                1, new Employee(1, "Rashi", "IT", 50000),
                2, new Employee(2, "Raj", "HR", 45000)
        );

        List<String> names = map.values()
                                .stream()
                                .map(e -> e.name)
                                .collect(Collectors.toList());

        System.out.println(names);
    }
}
