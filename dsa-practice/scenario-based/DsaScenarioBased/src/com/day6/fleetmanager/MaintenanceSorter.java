package com.day6.fleetmanager;

public class MaintenanceSorter {

    public int[] merge(int[] depot1, int[] depot2) {

        int i = 0, j = 0, k = 0;
        int[] master = new int[depot1.length + depot2.length];

        while (i < depot1.length && j < depot2.length) {
            if (depot1[i] <= depot2[j]) {
                master[k++] = depot1[i++];
            } else {
                master[k++] = depot2[j++];
            }
        }

        while (i < depot1.length) {
            master[k++] = depot1[i++];
        }

        while (j < depot2.length) {
            master[k++] = depot2[j++];
        }

        return master;
    }
}
