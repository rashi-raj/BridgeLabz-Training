package com.sortingalgorithms;

import java.util.Arrays;

public class HeapSort{

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {50000, 30000, 70000, 45000, 60000};
        int n = salaries.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salaries, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }

        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}
