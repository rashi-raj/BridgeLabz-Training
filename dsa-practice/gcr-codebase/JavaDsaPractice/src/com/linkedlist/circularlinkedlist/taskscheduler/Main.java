package com.linkedlist.circularlinkedlist.taskscheduler;

public class Main{

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtBeginning(1, "Design Module", 1, "2025-02-10");
        scheduler.addAtEnd(2, "Code Implementation", 2, "2025-02-15");
        scheduler.addAtPosition(2, 3, "Testing", 1, "2025-02-18");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nView Current Task:");
        scheduler.viewCurrentTask();

        System.out.println("\nNext Task:");
        scheduler.viewCurrentTask();

        System.out.println("\nSearch by Priority 1:");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        System.out.println("\nAfter Removal:");
        scheduler.displayAllTasks();
    }
}
