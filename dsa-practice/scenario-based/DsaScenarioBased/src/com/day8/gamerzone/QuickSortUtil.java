package com.day8.gamerzone;

import java.util.List;

public class QuickSortUtil {

    public static void quickSort(List<Player> players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Player> players, int low, int high) {

        int pivot = players.get(high).score; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).score >= pivot) { // descending order
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Player> players, int i, int j) {
        Player temp = players.get(i);
        players.set(i, players.get(j));
        players.set(j, temp);
    }
}
