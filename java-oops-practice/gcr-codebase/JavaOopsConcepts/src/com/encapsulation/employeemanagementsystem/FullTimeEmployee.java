package com.encapsulation.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {

    private String department;

    FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary; // fixed salary
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
