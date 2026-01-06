package com.sortingalgorithms;

import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] empIds = {105, 101, 109, 103, 102};

        for (int i = 1; i < empIds.length; i++) {
            int key = empIds[i];
            int j = i - 1;

            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs: " + Arrays.toString(empIds));
    }
}
