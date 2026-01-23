package com.day9.ecommerceinventory;

public class BST {
	Product root;
	
	public Product insert(Product root, String name, int skuNo) {
		if(root==null) {
			return new Product(name,skuNo);
		}
		if(skuNo > root.skuNo) {
			root.right = insert(root.right, name,skuNo);
		}
		else if(skuNo < root.skuNo) {
			root.left = insert(root.left,name, skuNo);
		}
		else {
			System.out.println("Product already exists");
		}
		
		return root;
	}
	
	//SEARCH
	public Product search(Product root, int skuNo) {
	    if (root == null || root.skuNo == skuNo)
	        return root;
	    if (skuNo > root.skuNo)
	        return search(root.right, skuNo);
	    else
	        return search(root.left, skuNo);
	}
	
	//UPDATE
	public boolean update(Product root, int skuNo, String newName) {
		if(root==null) return false;
		if(root.skuNo == skuNo) {
			root.name = newName;
			return true;
		}
		
		if(skuNo>root.skuNo) {
			return update(root.right, skuNo, newName);
		}else if(skuNo<root.skuNo){
			return update(root.left, skuNo, newName);
		}
		return false;
	}
	
	// DISPLAY
    public void display() {
        if (root == null)
            System.out.println("No Product records found.");
        else
            inorder(root);
    }

    private void inorder(Product root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Name: " + root.name + ", SKU No: " + root.skuNo);
            inorder(root.right);
        }
    }
}
