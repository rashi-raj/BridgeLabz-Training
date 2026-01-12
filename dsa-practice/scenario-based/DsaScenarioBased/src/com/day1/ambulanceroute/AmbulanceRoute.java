package com.day1.ambulanceroute;

class AmbulanceRoute {

    Unit head = null;
    Unit tail = null;

    // Add hospital unit
    void addUnit(String name) {
        Unit newUnit = new Unit(name);

        if (head == null) {
            head = tail = newUnit;
            tail.next = head;
        } else {
            tail.next = newUnit;
            tail = newUnit;
            tail.next = head;
        }
        System.out.println(name + " added to route.");
    }

    // Display units
    void displayUnits() {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        Unit temp = head;
        do {
            System.out.println(temp.name + " (Available: " + temp.available + ")");
            temp = temp.next;
        } while (temp != head);
    }

    // Find nearest available unit
    void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units.");
            return;
        }

        Unit temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No unit available currently.");
    }

    // Mark unit under maintenance
    void setMaintenance(String name) {
        if (head == null) return;

        Unit temp = head;
        do {
            if (temp.name.equalsIgnoreCase(name)) {
                temp.available = false;
                System.out.println(name + " set under maintenance.");
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Unit not found.");
    }

    // Remove unit completely
    void removeUnit(String name) {
        if (head == null) {
            System.out.println("Route empty.");
            return;
        }

        Unit curr = head;
        Unit prev = tail;

        do {
            if (curr.name.equalsIgnoreCase(name)) {

                if (head == tail) {
                    head = tail = null;
                }
         
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
          
                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                }
           
                else {
                    prev.next = curr.next;
                }

                System.out.println(name + " removed from route.");
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Unit not found.");
    }
}
