package com.day10.hospitalqueuemanagement;

public class HospitalQueueAVL {
	private AVLNodePatient root;

    private int height(AVLNodePatient node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(AVLNodePatient node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AVLNodePatient rightRotate(AVLNodePatient y) {
        AVLNodePatient x = y.left;
        AVLNodePatient T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        return x;
    }

    private AVLNodePatient leftRotate(AVLNodePatient x) {
        AVLNodePatient y = x.right;
        AVLNodePatient T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    // Register patient
    public void insert(Patient p) {
        root = insertRec(root, p);
    }

    private AVLNodePatient insertRec(AVLNodePatient node, Patient p) {
        if (node == null) return new AVLNodePatient(p);

        if (p.checkInTime < node.key) node.left = insertRec(node.left, p);
        else if (p.checkInTime > node.key) node.right = insertRec(node.right, p);
        else {
            node.patient = p; // update
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && p.checkInTime < node.left.key) return rightRotate(node);
        if (balance < -1 && p.checkInTime > node.right.key) return leftRotate(node);
        if (balance > 1 && p.checkInTime > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && p.checkInTime < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Discharge patient
    public void delete(int checkInTime) {
        root = deleteRec(root, checkInTime);
    }

    private AVLNodePatient deleteRec(AVLNodePatient node, int key) {
        if (node == null) return node;

        if (key < node.key) node.left = deleteRec(node.left, key);
        else if (key > node.key) node.right = deleteRec(node.right, key);
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            AVLNodePatient minNode = minValueNode(node.right);
            node.key = minNode.key;
            node.patient = minNode.patient;
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

    private AVLNodePatient minValueNode(AVLNodePatient node) {
        AVLNodePatient current = node;
        while (current.left != null) current = current.left;
        return current;
    }

    // Display queue by arrival
    public void displayQueue() {
        inorder(root);
    }

    private void inorder(AVLNodePatient node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.patient);
        inorder(node.right);
    }
}

