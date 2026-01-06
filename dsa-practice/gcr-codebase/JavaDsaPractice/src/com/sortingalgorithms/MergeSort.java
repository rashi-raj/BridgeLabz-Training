package com.sortingalgorithms;

import java.util.Arrays;

public class MergeSort{

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right)
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i - left];
    }

    public static void main(String[] args) {
        int[] prices = {499, 299, 799, 199, 599};
        mergeSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Book Prices: " + Arrays.toString(prices));
    }
}