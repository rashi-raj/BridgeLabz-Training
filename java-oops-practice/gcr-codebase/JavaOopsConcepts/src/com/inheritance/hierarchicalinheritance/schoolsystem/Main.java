package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Riya", 16, "10th Grade");
        Person p3 = new Staff("Mr. Verma", 35, "Administration");

        p1.displayBasicInfo();
        ((Teacher) p1).displayRole();

        System.out.println();

        p2.displayBasicInfo();
        ((Student) p2).displayRole();

        System.out.println();

        p3.displayBasicInfo();
        ((Staff) p3).displayRole();
    }
}