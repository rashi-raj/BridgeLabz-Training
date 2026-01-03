package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinScheduler {

    private ProcessNode head;
    private int totalTime = 0;
    private int processCount = 0;

    /* Add process at end */
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = node;
            node.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
        processCount++;
    }

    /* Remove process by ID */
    private void removeProcess(ProcessNode prev, ProcessNode curr) {

        if (curr == head && curr.next == head) {
            head = null;
        } else {
            if (curr == head) {
                head = head.next;
            }
            prev.next = curr.next;
        }
        processCount--;
    }

    /* Simulate Round Robin Scheduling */
    public void schedule(int timeQuantum) {

        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        ProcessNode curr = head;
        ProcessNode prev = null;

        System.out.println("\n--- Round Robin Scheduling Start ---");

        while (head != null) {

            System.out.println("\nExecuting Process ID: " + curr.processId);

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                totalTime += timeQuantum;
            } else {
                totalTime += curr.remainingTime;
                curr.remainingTime = 0;
                curr.turnaroundTime = totalTime;
                curr.waitingTime = curr.turnaroundTime - curr.burstTime;
            }

            displayQueue();

            if (curr.remainingTime == 0) {
                ProcessNode nextNode = curr.next;
                removeProcess(prev == null ? getLastNode() : prev, curr);
                curr = nextNode;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        System.out.println("\n--- Scheduling Completed ---");
    }

    /* Display circular queue */
    public void displayQueue() {

        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.processId +
                    " | RT=" + temp.remainingTime + "] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    /* Calculate and display average times */
    public void displayAverageTimes(ProcessNode[] completed) {

        double totalWT = 0;
        double totalTAT = 0;

        for (ProcessNode p : completed) {
            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        System.out.println("\nAverage Waiting Time: " + (totalWT / completed.length));
        System.out.println("Average Turnaround Time: " + (totalTAT / completed.length));
    }

    private ProcessNode getLastNode() {
        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }
}
