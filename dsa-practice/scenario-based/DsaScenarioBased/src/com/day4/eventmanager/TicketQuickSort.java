package com.day4.eventmanager;

import java.util.List;

public class TicketQuickSort {

    public void quickSort(List<Ticket> tickets, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(tickets, low, high);
            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    private int partition(List<Ticket> tickets, int low, int high) {

        double pivot = tickets.get(high).price; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets.get(j).price <= pivot) {
                i++;
                swap(tickets, i, j);
            }
        }

        swap(tickets, i + 1, high);
        return i + 1;
    }

    private void swap(List<Ticket> tickets, int i, int j) {
        Ticket temp = tickets.get(i);
        tickets.set(i, tickets.get(j));
        tickets.set(j, temp);
    }
}
