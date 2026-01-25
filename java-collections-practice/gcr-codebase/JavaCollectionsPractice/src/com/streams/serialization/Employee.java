package com.streams.serialization;

/*
Employee class for serialization
*/
import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}
