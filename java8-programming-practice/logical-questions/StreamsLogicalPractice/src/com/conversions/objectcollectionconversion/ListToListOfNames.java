package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class ListToListOfNames {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rashi", "IT", 50000),
                new Employee(2, "Raj", "HR", 45000)
        );

        List<String> names = employees.stream()
                                      .map(e -> e.name)
                                      .collect(Collectors.toList());

        System.out.println(names);
    }
}
