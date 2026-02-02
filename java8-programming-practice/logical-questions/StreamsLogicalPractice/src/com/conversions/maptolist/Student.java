package com.conversions.maptolist;
import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class MapToCustomObjectList {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Rashi", 2, "Raj");

        List<Student> students = map.entrySet()
                                    .stream()
                                    .map(e -> new Student(e.getKey(), e.getValue()))
                                    .collect(Collectors.toList());

        System.out.println(students);
    }
}
