package com.encapsulation.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(101, "Rohit", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Anjali", 500, 40);

        ((Department) emp1).assignDepartment("IT");
        ((Department) emp2).assignDepartment("HR");

        Employee[] employees = { emp1, emp2 };

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Department: " +
                    ((Department) emp).getDepartmentDetails());
            System.out.println();
        }
    }
}
