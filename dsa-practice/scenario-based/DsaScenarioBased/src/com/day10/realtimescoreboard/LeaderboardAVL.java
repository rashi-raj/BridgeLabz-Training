package com.day10.realtimescoreboard;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardAVL {
	private AVLNode root;

    // Height
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    // Balance factor
    private int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x;
    }
 // Left rotate
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    // Insert or Update Player
    public void insert(Player p) {
        root = insertRec(root, p);
    }

    private AVLNode insertRec(AVLNode node, Player p) {
        if (node == null) return new AVLNode(p);

        if (p.score < node.key)
            node.left = insertRec(node.left, p);
        else if (p.score > node.key)
            node.right = insertRec(node.right, p);
        else {
            // Update existing player's name
            node.player = p;
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Balancing
        if (balance > 1 && p.score < node.left.key) return rightRotate(node);
        if (balance < -1 && p.score > node.right.key) return leftRotate(node);
        if (balance > 1 && p.score > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && p.score < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Delete Player by score
    public void delete(int score) {
        root = deleteRec(root, score);
    }

    private AVLNode deleteRec(AVLNode node, int key) {
        if (node == null) return node;

        if (key < node.key) node.left = deleteRec(node.left, key);
        else if (key > node.key) node.right = deleteRec(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            AVLNode minNode = minValueNode(node.right);
            node.key = minNode.key;
            node.player = minNode.player;
            node.right = deleteRec(node.right, minNode.key);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) return rightRotate(node);
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0) return leftRotate(node);
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    // Display Top N Players (Reverse Inorder)
    public void displayTop(int n) {
        List<Player> top = new ArrayList<>();
        reverseInorder(root, top, n);
        for (Player p : top) System.out.println(p);
    }

    private void reverseInorder(AVLNode node, List<Player> list, int n) {
        if (node == null || list.size() >= n) return;
        reverseInorder(node.right, list, n);
        if (list.size() < n) list.add(node.player);
        reverseInorder(node.left, list, n);
    }
}
