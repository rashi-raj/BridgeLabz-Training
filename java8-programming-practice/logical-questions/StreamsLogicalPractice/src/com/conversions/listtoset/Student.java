package com.conversions.listtoset;
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class SetObjectsToListOfNames {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Rashi", 20));
        students.add(new Student("Raj", 22));

        List<String> names = students.stream()
                                     .map(s -> s.name)
                                     .collect(Collectors.toList());

        System.out.println(names);
    }
}
