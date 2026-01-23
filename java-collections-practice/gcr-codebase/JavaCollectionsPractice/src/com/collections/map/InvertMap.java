package com.collections.map;

/*
Invert a Map
Invert a Map<K, V> to produce a Map<V, K>.
Handle duplicate values by storing them in a list.

Example:
Input: {A=1, B=2, C=1}
Output: {1=[A, C], 2=[B]}
*/

import java.util.*;

public class InvertMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Original map
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();

        // Read key-value pairs dynamically
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map.put(key, value);
        }

        // Inverted map: value -> list of keys
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println("Inverted Map: " + invertedMap);

        sc.close();
    }
}
