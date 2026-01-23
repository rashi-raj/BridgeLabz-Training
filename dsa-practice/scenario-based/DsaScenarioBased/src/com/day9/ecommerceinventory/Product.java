package com.day9.ecommerceinventory;

public class Product {
	String name;
	int skuNo;
	Product left;
	Product right;
	public Product(String name, int skuNo) {
		super();
		this.name = name;
		this.skuNo = skuNo;
		this.left = this.right = null;
	}
	
	
}
