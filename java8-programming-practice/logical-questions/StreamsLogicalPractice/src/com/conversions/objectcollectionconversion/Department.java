package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class Department {
    String name;
    List<Employee> employees;

    Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
}

class NestedListToFlatList {
    public static void main(String[] args) {
        List<Department> depts = Arrays.asList(
                new Department("IT", Arrays.asList(
                        new Employee(1, "Rashi", "IT", 50000),
                        new Employee(3, "Ankit", "IT", 55000))),
                new Department("HR", Arrays.asList(
                        new Employee(2, "Raj", "HR", 45000)))
        );

        List<Employee> allEmployees = depts.stream()
                                           .flatMap(d -> d.employees.stream())
                                           .collect(Collectors.toList());

        System.out.println(allEmployees);
    }
}
