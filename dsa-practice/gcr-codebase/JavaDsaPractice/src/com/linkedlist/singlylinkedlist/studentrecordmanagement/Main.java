package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {

    public static void main(String[] args) {

        StudentList list = new StudentList();
        StudentNode head = null;

        // Add students
        head = list.addNodeAtStart(head, 1, "Will", 20, "A");
        head = list.addNodeAtEnd(head, 2, "Mike", 21, "B");
        head = list.addNodeAtPosition(head, 3, "Steve", 19, "A", 2);

        // Display all students
        list.displayAllStudents(head);

        // Search student
        list.searchStudent(head, 2);

        // Update grade
        list.updateGrade(head, 2, "A");

        // Delete student by roll number
        head = list.deleteByRollNumber(head, 1);

        System.out.println("\nAfter updates:");
        list.displayAllStudents(head);
    }
}
