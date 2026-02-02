package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}

public class EmployeeIdNameMap {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Amit"),
                new Employee(2, "Neha")
        );

        Map<Integer, String> map =
                list.stream()
                    .collect(Collectors.toMap(
                            Employee::getId,
                            Employee::getName
                    ));

        System.out.println(map);
    }
}
