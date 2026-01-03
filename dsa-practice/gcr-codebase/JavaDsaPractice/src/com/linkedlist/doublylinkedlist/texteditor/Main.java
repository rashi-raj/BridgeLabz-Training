package com.linkedlist.doublylinkedlist.texteditor;

public class Main {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! Welcome");

        editor.displayCurrentState();

        System.out.println("\nUndo Operation:");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("\nUndo Operation:");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("\nRedo Operation:");
        editor.redo();
        editor.displayCurrentState();

        System.out.println("\nAdding new text after undo (Redo cleared):");
        editor.addState("Hello World! Java");
        editor.displayCurrentState();

        System.out.println("\nRedo Operation:");
        editor.redo();   // should not work
    }
}
