package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class Main {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtBeginning(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtPosition(2, 103, "Keyboard", 10, 1500);

        System.out.println("All Items:");
        inventory.displayAllItems();

        inventory.searchByItemId(102);
        inventory.searchByItemName("Laptop");

        inventory.updateQuantity(101, 7);

        inventory.calculateTotalValue();

        System.out.println("\nSorted by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayAllItems();

        System.out.println("\nSorted by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayAllItems();

        inventory.removeByItemId(102);

        System.out.println("\nAfter Removal:");
        inventory.displayAllItems();
    }
}
