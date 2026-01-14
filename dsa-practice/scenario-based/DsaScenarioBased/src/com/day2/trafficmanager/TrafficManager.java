package com.day2.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    Vehicle current;                 
    int count = 0;
    // max vehicles allowed
    int MAX = 5;                     
    Queue<String> waitingQueue = new LinkedList<>();

    // Vehicle enters roundabout
    void enterVehicle(String number) {

        if (count == MAX) {
            waitingQueue.offer(number);
            System.out.println(number + " added to waiting queue");
            return;
        }

        Vehicle newVehicle = new Vehicle(number);

        if (current == null) {
            current = newVehicle;
            current.next = current;
        } else {
            newVehicle.next = current.next;
            current.next = newVehicle;
            current = newVehicle;
        }

        count++;
        System.out.println(number + " entered roundabout");
    }

    // Vehicle exits roundabout
    void exitVehicle() {

        if (current == null) {
            System.out.println("No vehicles in roundabout");
            return;
        }

        if (count == 1) {
            System.out.println(current.number + " exited roundabout");
            current = null;
        } else {
            Vehicle temp = current.next;
            current.next = temp.next;
            System.out.println(temp.number + " exited roundabout");
        }

        count--;

        if (!waitingQueue.isEmpty()) {
            enterVehicle(waitingQueue.poll());
        }
    }

    // Print roundabout state
    void printRoundabout() {

        if (current == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = current.next;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != current.next);

        System.out.println("(back to start)");
    }
}
