package com.day2.customerqueuemanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenter {

    Queue<Customer> normalQueue = new LinkedList<>();

    PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> a.name.compareTo(b.name));

    HashMap<String, Integer> map = new HashMap<>();

    // Incoming call
    public void receiveCall(Customer customer) {

        map.put(customer.id, map.getOrDefault(customer.id, 0) + 1);

        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP customer added: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal customer added: " + customer.name);
        }
    }

    // Serve next customer
    public void serveCustomer() {

        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Serving VIP customer: " + customer.name);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Serving normal customer: " + customer.name);
        } else {
            System.out.println("No customers in queue");
            return;
        }
    }

    // Display call counts
    public void displayCallCounts() {
        System.out.println("\nCustomer Call Count This Month:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
