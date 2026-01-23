package com.collections.map;

/*
Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.

Example:
Map1: {A=1, B=2}
Map2: {B=3, C=4}
Output: {A=1, B=5, C=4}
*/

import java.util.*;

public class MergeTwoMaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.print("Enter number of entries in Map1: ");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map1.put(key, value);
        }

        System.out.print("Enter number of entries in Map2: ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map2.put(key, value);
        }

        // Result map initialized with Map1
        Map<String, Integer> result = new HashMap<>(map1);

        // Merge Map2 into result
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println("Merged Map: " + result);

        sc.close();
    }
}
