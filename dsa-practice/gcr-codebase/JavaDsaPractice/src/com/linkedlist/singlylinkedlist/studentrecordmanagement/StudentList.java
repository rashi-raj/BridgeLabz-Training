package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class StudentList {

    // Add at Beginning 
    StudentNode addNodeAtStart(StudentNode head, int rollNumber, String name, int age, String grade) {
        StudentNode node = new StudentNode(rollNumber, name, age, grade);
        node.next = head;
        return node;
    }

    // Add at End 
    StudentNode addNodeAtEnd(StudentNode head, int rollNumber, String name, int age, String grade) {
        StudentNode node = new StudentNode(rollNumber, name, age, grade);

        if (head == null)
            return node;

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

        return head;
    }

    // Add at Specific Position 
    StudentNode addNodeAtPosition(StudentNode head, int rollNumber, String name, int age, String grade, int position) {

        if(position <= 0) {
            System.out.println("Invalid position");
            return head;
        }

        if(position == 1) {
            return addNodeAtStart(head, rollNumber, name, age, grade);
        }

        StudentNode node = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;

        for(int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("Position out of range");
            return head;
        }

        node.next = temp.next;
        temp.next = node;

        return head;
    }

    // Delete by Roll Number 
    StudentNode deleteByRollNumber(StudentNode head, int rollNumber) {

        if (head == null)
            return null;

        if (head.rollNumber == rollNumber) {
            return head.next;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
        }

        return head;
    }

    /* Search by Roll Number */
    void searchStudent(StudentNode head, int rollNumber) {

        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("\nStudent Found:");
                displaySingleStudent(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("\nStudent not found");
    }

    // Update Grade 
    void updateGrade(StudentNode head, int rollNumber, String newGrade) {

        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("\nGrade updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("\nStudent not found");
    }

    // Display All Records 
    void displayAllStudents(StudentNode head) {

        if (head == null) {
            System.out.println("\nNo student records available");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displaySingleStudent(temp);
            temp = temp.next;
        }
    }

    private void displaySingleStudent(StudentNode student) {
        System.out.println("\nRoll No: " + student.rollNumber +
                "\nName: " + student.name +
                "\nAge: " + student.age +
                "\nGrade: " + student.grade);
    }
}
