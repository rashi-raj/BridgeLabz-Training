package com.day1.tabhistorymanager;

class Tab {

    Node current;

    // Visit new page
    void visit(String url) {
        Node newNode = new Node(url);

        if (current != null) {
            current.next = null;  
            newNode.prev = current;
            current.next = newNode;
        }

        current = newNode;
        System.out.println("Visited: " + url);
    }

    // Go Back
    void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Go Forward
    void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    // Show current page
    void show() {
        if (current == null)
            System.out.println("No page opened.");
        else
            System.out.println("Current page: " + current.url);
    }
}
