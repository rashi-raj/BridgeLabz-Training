package com.day3.deliverychainmanagement;

public class ParcelTracker {

    Stage head;

    // add stage at end
    void addStage(String name) {

        Stage newStage = new Stage(name);

        if (head == null) {
            head = newStage;
            return;
        }

        Stage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newStage;
    }

    // add checkpoint after given stage
    void addCheckpoint(String after, String checkpoint) {

        Stage temp = head;

        while (temp != null && !temp.name.equals(after)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found");
            return;
        }

        Stage newStage = new Stage(checkpoint);
        newStage.next = temp.next;
        temp.next = newStage;

        System.out.println("Checkpoint added");
    }

    // track parcel forward
    void trackParcel() {

        if (head == null) {
            System.out.println("Parcel lost (no tracking info)");
            return;
        }

        Stage temp = head;
        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // simulate missing parcel
    void markLost() {
        head = null;
        System.out.println("Parcel marked as lost");
    }
}
