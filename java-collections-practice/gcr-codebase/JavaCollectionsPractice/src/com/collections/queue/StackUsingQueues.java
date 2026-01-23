package com.collections.queue;

/*
 * Implement a Stack Using Queues
Implement a stack data structure using two queues and support push, pop, and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3
 */
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    void push(int x) {
        q2.add(x);                 // add new element to empty q2

        // move all elements of q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    int pop() {
        return q1.remove();     
    }

    // Peek top element
    int top() {
        return q1.peek();
    }

    public static void main(String[] args) {

        StackUsingQueues s = new StackUsingQueues();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
    }
}
