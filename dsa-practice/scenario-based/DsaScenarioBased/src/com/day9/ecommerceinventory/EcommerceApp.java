package com.day9.ecommerceinventory;

/*
 * Story: E-Commerce Product Inventory
An online store categorizes products by SKU numbers.
Scenarios:
● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order.
 */
import java.util.Scanner;

public class EcommerceApp {
	public static void main(String[] args) {
		BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Ecommerce Inventory System =====");
            System.out.println("1. Insert Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Product name");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter SKU number: ");
                    int skuNo = sc.nextInt();
                    bst.root = bst.insert(bst.root, name, skuNo);
                    System.out.println("Product inserted successfully.");
                    break;

                case 2:
                    System.out.print("Enter SKU number to search: ");
                    int searchSKU = sc.nextInt();
                    Product p = bst.search(bst.root, searchSKU);
                    if (p != null)
                        System.out.println("Found → Name: " + p.name);
                    else
                        System.out.println("Product not found.");
                    break;

                case 3:
                    System.out.print("Enter SKUNo of the Product: ");
                    int sku = sc.nextInt();
                    System.out.println("Enter name to be updated");
                    String updatedName = sc.next();
                    if(bst.update(bst.root, sku, updatedName)) {
                    	System.out.println("Record updated successfully");
                    }else {
                    	System.out.println("Product not found");
                    }
                    break;

                case 4:
                    System.out.println("\nProduct Records (Sorted by SKU No):");
                    bst.display();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

