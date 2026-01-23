package com.collections.queue;

/*
 * Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].

 */
import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        // Queue is used to maintain FIFO order of binary numbers
        Queue<String> queue = new LinkedList<>();
        queue.add("1");  

        System.out.println("\nFirst " + N + " Binary Numbers:");

        // Generate N binary numbers
        for (int i = 1; i <= N; i++) {

            // Remove and print the front binary number
            String current = queue.remove();
            System.out.println(current);

            // Generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        sc.close();
    }
}
