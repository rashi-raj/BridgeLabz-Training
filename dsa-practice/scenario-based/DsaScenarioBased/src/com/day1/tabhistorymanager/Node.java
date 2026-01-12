package com.day1.tabhistorymanager;

class Node {
    String url;
    Node prev;
    Node next;

    Node(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
