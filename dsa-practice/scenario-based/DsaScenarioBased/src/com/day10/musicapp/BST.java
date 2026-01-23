package com.day10.musicapp;

public class BST {
    Song root;

    // INSERT (ordered by title)
    public Song insert(Song root, int trackId, String title) {
        if (root == null)
            return new Song(trackId, title);

        if (title.compareToIgnoreCase(root.title) < 0)
            root.left = insert(root.left, trackId, title);
        else if (title.compareToIgnoreCase(root.title) > 0)
            root.right = insert(root.right, trackId, title);

        return root;
    }

    // SEARCH by Track ID
    public Song searchByTrackId(Song root, int trackId) {
        if (root == null)
            return null;

        if (root.trackId == trackId)
            return root;

        Song left = searchByTrackId(root.left, trackId);
        if (left != null)
            return left;

        return searchByTrackId(root.right, trackId);
    }

    // DISPLAY Alphabetically
    public void display() {
        if (root == null)
            System.out.println("No songs in library.");
        else
            inorder(root);
    }

    private void inorder(Song root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Title: " + root.title + ", Track ID: " + root.trackId);
            inorder(root.right);
        }
    }
}
