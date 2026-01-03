package com.linkedlist.doublylinkedlist.texteditor;

class TextStateNode {

    String content;
    TextStateNode prev;
    TextStateNode next;

    TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
