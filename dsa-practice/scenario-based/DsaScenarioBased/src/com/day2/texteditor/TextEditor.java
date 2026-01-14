package com.day2.texteditor;

import java.util.Stack;

public class TextEditor {

    private StringBuilder content = new StringBuilder();
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action("insert", text));
        redoStack.clear();
        System.out.println("Inserted: " + text);
    }

    // Delete last n characters
    public void delete(int n) {
        if (n > content.length()) {
            n = content.length();
        }

        String deletedText = content.substring(content.length() - n);
        content.delete(content.length() - n, content.length());

        undoStack.push(new Action("delete", deletedText));
        redoStack.clear();
        System.out.println("Deleted: " + deletedText);
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content.delete(content.length() - action.text.length(), content.length());
        } else if (action.type.equals("delete")) {
            content.append(action.text);
        }

        redoStack.push(action);
        System.out.println("Undo performed");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content.append(action.text);
        } else if (action.type.equals("delete")) {
            content.delete(content.length() - action.text.length(), content.length());
        }

        undoStack.push(action);
        System.out.println("Redo performed");
    }

    // Display content
    public void display() {
        System.out.println("Current Text: " + content);
    }
}

