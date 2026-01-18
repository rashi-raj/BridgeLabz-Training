package com.day5.cinemahouse;

public class ShowTimeSorter {

    public void bubbleSort(int[] showTimes) {
        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (showTimes[j] > showTimes[j + 1]) {
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                }
            }
        }
    }
}
