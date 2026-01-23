package com.collections.queue;

/*
 * Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
 */
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    // Reverses the queue using recursion
    static void reverse(Queue<Integer> q) {
        if (q.isEmpty())
            return;

        int temp = q.remove();   // remove front element
        reverse(q);              // reverse remaining queue
        q.add(temp);             // add removed element at rear
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        reverse(q);
        System.out.println(q);
    }
}
