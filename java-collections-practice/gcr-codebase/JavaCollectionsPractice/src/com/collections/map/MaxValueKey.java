package com.collections.map;

/*
Find the Key with the Highest Value
Given a Map<String, Integer>, find the key with the maximum value.

Example:
Input: {A=10, B=20, C=15}
Output: B
*/

import java.util.*;

public class MaxValueKey {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        // Read key-value pairs dynamically
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map.put(key, value);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Find key with maximum value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Key with highest value: " + maxKey);

        sc.close();
    }
}
