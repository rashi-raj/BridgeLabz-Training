package com.streamslogical2;
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class HighestSalaryEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Ravi", 70000),
                new Employee(3, "Neha", 60000)
        );

        Employee result =
                employees.stream()
                         .max(Comparator.comparingDouble(Employee::getSalary))
                         .orElse(null);

        System.out.println(result);
    }
}
