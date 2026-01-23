package com.collections.queue;

/*
 * Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.

 */

import java.util.PriorityQueue;

public class HospitalTriageSystem {

    // Inner class 
    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {

        // PriorityQueue → higher severity treated first (max-heap)
        PriorityQueue<Patient> queue = new PriorityQueue<>(
            (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        // Adding patients
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        // Treatment order
        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println(p.name);
        }
    }
}
