package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class ListToMapSalaryByName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rashi", "IT", 50000),
                new Employee(2, "Raj", "HR", 45000)
        );

        Map<String, Double> salaryMap = employees.stream()
                                                 .collect(Collectors.toMap(e -> e.name, e -> e.salary));

        System.out.println(salaryMap);
    }
}
