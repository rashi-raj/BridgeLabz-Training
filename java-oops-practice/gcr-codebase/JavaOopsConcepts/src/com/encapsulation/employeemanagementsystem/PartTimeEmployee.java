package com.encapsulation.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private String department;

    PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return baseSalary * hoursWorked;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
