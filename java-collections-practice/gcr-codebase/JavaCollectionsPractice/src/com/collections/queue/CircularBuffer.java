package com.collections.queue;

/*
 * Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
 */

public class CircularBuffer {

    int[] buffer;
    int size;
    int front = 0, rear = 0, count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Inserts an element into the circular buffer
    void insert(int value) {
        buffer[rear] = value;               
        rear = (rear + 1) % size;          

        if (count < size)
            count++;                         
        else
            front = (front + 1) % size;   
    }

    // Displays elements from front to rear
    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);   

        cb.display();
    }
}
