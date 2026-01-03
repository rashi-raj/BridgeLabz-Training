package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current;  

    // Add at Beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        node.next = head;
        temp.next = node;
        head = node;
    }

    // Add at End
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // Add at Specific Position (1-based index) 
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode node = new TaskNode(id, name, priority, dueDate);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove Task by ID 
    public void removeByTaskId(int taskId) {

        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == taskId) {

                if (curr == head) {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }

                    if (head.next == head) {
                        head = current = null;
                    } else {
                        head = head.next;
                        temp.next = head;
                        if (current == curr)
                            current = head;
                    }
                } else {
                    prev.next = curr.next;
                    if (current == curr)
                        current = curr.next;
                }

                System.out.println("Task removed successfully");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Task not found");
    }

    // View Current Task and Move to Next 
    public void viewCurrentTask() {

        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task:");
        displaySingle(current);
        current = current.next;
    }

    // Search Task by Priority 
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displaySingle(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task found with priority: " + priority);
    }

    // Display All Tasks 
    public void displayAllTasks() {

        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        do {
            displaySingle(temp);
            temp = temp.next;
        } while (temp != head);
    }

    private void displaySingle(TaskNode t) {
        System.out.println("Task ID: " + t.taskId +
                ", Name: " + t.taskName +
                ", Priority: " + t.priority +
                ", Due Date: " + t.dueDate);
    }
}
