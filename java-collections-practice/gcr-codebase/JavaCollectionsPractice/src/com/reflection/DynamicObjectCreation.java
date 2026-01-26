package com.reflection;

class Student {
    public Student() {
        System.out.println("Student object created");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("reflection.Student");
        Object obj = cls.getDeclaredConstructor().newInstance();
    }
}
