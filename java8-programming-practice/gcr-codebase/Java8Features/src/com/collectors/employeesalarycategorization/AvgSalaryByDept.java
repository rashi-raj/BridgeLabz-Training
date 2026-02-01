package com.collectors.employeesalarycategorization;
import java.util.*;
import java.util.stream.Collectors;

public class AvgSalaryByDept {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("A", "IT", 50000),
                new Employee("B", "HR", 40000),
                new Employee("C", "IT", 60000),
                new Employee("D", "HR", 45000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        System.out.println(avgSalaryByDept);
    }
}
