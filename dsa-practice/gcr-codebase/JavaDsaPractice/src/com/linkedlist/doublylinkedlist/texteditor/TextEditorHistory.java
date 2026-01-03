package com.linkedlist.doublylinkedlist.texteditor;

class TextEditorHistory {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int MAX_SIZE = 10;

    /* Add new text state */
    public void addState(String content) {
        TextStateNode newNode = new TextStateNode(content);

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Limit history size
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    /* Undo operation */
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    /* Redo operation */
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    /* Display current text */
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty");
        }
    }
}
