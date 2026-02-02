package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

class ListToMapById {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rashi", "IT", 50000),
                new Employee(2, "Raj", "HR", 45000),
                new Employee(3, "Ankit", "IT", 55000)
        );

        Map<Integer, Employee> map = employees.stream()
                                              .collect(Collectors.toMap(e -> e.id, e -> e));

        System.out.println(map);
    }
}
