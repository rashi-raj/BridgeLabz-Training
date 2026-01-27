package com.day10.onlineticketbooking;

public class AVLNodeEvent {
	int key;
    Event event;
    AVLNodeEvent left, right;
    int height;

    AVLNodeEvent(Event e) {
        key = e.startTime;
        event = e;
        height = 1;
    }
}
