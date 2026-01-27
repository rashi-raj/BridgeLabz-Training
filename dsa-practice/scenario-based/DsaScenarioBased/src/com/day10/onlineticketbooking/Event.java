package com.day10.onlineticketbooking;

public class Event {
	String name;
    int startTime; // could be timestamp or simple int for demo

    Event(String name, int startTime) {
        this.name = name;
        this.startTime = startTime;
    }

    public String toString() {
        return name + " at " + startTime;
    }
}
