package com.day10.hospitalqueuemanagement;

public class AVLNodePatient {
	int key;
    Patient patient;
    AVLNodePatient left, right;
    int height;

    AVLNodePatient(Patient p) {
        key = p.checkInTime;
        patient = p;
        height = 1;
    }
}
