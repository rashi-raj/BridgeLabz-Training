package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class ListToGroupedMap {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rashi", "IT", 50000),
                new Employee(2, "Raj", "HR", 45000),
                new Employee(3, "Ankit", "IT", 55000)
        );

        Map<String, Double> salarySumByDept = employees.stream()
                                                       .collect(Collectors.groupingBy(e -> e.dept,
                                                       Collectors.summingDouble(e -> e.salary)));

        System.out.println(salarySumByDept);
    }
}
