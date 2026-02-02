package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class ListToCompositeKeyMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rashi", "IT", 50000),
                new Employee(2, "Raj", "HR", 45000),
                new Employee(3, "Ankit", "IT", 55000)
        );

        Map<String, Employee> map = employees.stream()
                .collect(Collectors.toMap(e -> e.dept + "-" + e.name, e -> e));

        System.out.println(map);
    }
}
