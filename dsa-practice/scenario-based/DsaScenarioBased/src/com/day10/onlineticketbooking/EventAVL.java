package com.day10.onlineticketbooking;

public class EventAVL {
	private AVLNodeEvent root;

    private int height(AVLNodeEvent node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(AVLNodeEvent node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AVLNodeEvent rightRotate(AVLNodeEvent y) {
        AVLNodeEvent x = y.left;
        AVLNodeEvent T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x;
    }
    private AVLNodeEvent leftRotate(AVLNodeEvent x) {
        AVLNodeEvent y = x.right;
        AVLNodeEvent T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    // Insert Event
    public void insert(Event e) {
        root = insertRec(root, e);
    }

    private AVLNodeEvent insertRec(AVLNodeEvent node, Event e) {
        if (node == null) return new AVLNodeEvent(e);

        if (e.startTime < node.key) node.left = insertRec(node.left, e);
        else if (e.startTime > node.key) node.right = insertRec(node.right, e);
        else {
            node.event = e; // update
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && e.startTime < node.left.key) return rightRotate(node);
        if (balance < -1 && e.startTime > node.right.key) return leftRotate(node);
        if (balance > 1 && e.startTime > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && e.startTime < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    // Delete Event
    public void delete(int startTime) {
        root = deleteRec(root, startTime);
    }

    private AVLNodeEvent deleteRec(AVLNodeEvent node, int key) {
        if (node == null) return node;

        if (key < node.key) node.left = deleteRec(node.left, key);
        else if (key > node.key) node.right = deleteRec(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            AVLNodeEvent minNode = minValueNode(node.right);
            node.key = minNode.key;
            node.event = minNode.event;
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

    private AVLNodeEvent minValueNode(AVLNodeEvent node) {
        AVLNodeEvent current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    // Display Events in order
    public void displayInOrder() {
        inorder(root);
    }

    private void inorder(AVLNodeEvent node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.event);
        inorder(node.right);
    }
}


