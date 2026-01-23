package com.collections.map;

/*
Group Objects by Property
Given a list of Employee objects, group them by their department
using a Map<Department, List<Employee>>.

Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)]
Output: HR: [Alice, Carol], IT: [Bob]
*/

import java.util.*;

public class GroupEmployeesByDepartment {

    // Employee class
    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        // Read employee details dynamically
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String department = sc.next();
            employees.add(new Employee(name, department));
        }

        Map<String, List<Employee>> grouped = new HashMap<>();

        // Group employees by department
        for (Employee e : employees) {
        	if (!grouped.containsKey(e.department)) {
        	    grouped.put(e.department, new ArrayList<>());
        	}
        	grouped.get(e.department).add(e);
        }

        System.out.println("Grouped Employees: " + grouped);

        sc.close();
    }
}
