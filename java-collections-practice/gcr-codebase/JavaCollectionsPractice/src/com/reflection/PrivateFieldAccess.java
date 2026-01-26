package com.reflection;

import java.lang.reflect.Field;

class Person {
    private int age = 20;
}


public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 30);
        System.out.println("Age = " + field.get(p));
    }
}
