package com.day9.universityrecordsystem;

public class BST {
	Student root;
	//Insert
	Student insert(Student root, String name, int rollNo) {
		if(root==null) {
			return new Student(name,rollNo);
		}
		
		if(rollNo < root.rollNo) {
			root.left = insert(root.left, name, rollNo);
		}else if(rollNo > root.rollNo) {
			root.right = insert(root.right, name, rollNo);
		}
		else {
			System.out.println("Roll no already exists");
		}
		
		return root;
	}
	
	//Searching 
	Student search(Student root, int rollNo) {
        if (root == null || root.rollNo == rollNo)
            return root;

        if (rollNo < root.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }
	
	//Deleting
	
	Student delete(Student root, int rollNo) {
        if (root == null)
            return root;

        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        } else {
            // Node with one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children
            Student successor = minValue(root.right);
            root.rollNo = successor.rollNo;
            root.name = successor.name;
            root.right = delete(root.right, successor.rollNo);
        }
        return root;
	}
        
	private Student minValue(Student root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    // DISPLAY
    public void display() {
        if (root == null)
            System.out.println("No student records found.");
        else
            inorder(root);
    }

    private void inorder(Student root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll No: " + root.rollNo + ", Name: " + root.name);
            inorder(root.right);
        }
    }
}