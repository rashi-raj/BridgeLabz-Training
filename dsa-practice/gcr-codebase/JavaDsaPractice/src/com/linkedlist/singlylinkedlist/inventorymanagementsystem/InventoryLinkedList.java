package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryLinkedList {

    private ItemNode head;

    // Add at Beginning 
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    // Add at End
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    // Add at Specific Position (1-based index) 
    public void addAtPosition(int position, int id, String name, int qty, double price) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove Item by ID 
    public void removeByItemId(int id) {

        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Update Quantity by Item ID 
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    // Search by Item ID 
    public void searchByItemId(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displaySingle(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found");
    }

    // Search by Item Name 
    public void searchByItemName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displaySingle(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found");
    }

    // Calculate Total Inventory Value 
    public void calculateTotalValue() {
        ItemNode temp = head;
        double total = 0;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    // Sort by Item Name 
    public void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
    }

    // Sort by Price 
    public void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
    }

    // Display All Items 
    public void displayAllItems() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displaySingle(temp);
            temp = temp.next;
        }
    }
    
    // Merge sort

    private ItemNode mergeSortByName(ItemNode h, boolean asc) {
        if (h == null || h.next == null)
            return h;

        ItemNode mid = getMiddle(h);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSortByName(h, asc);
        ItemNode right = mergeSortByName(nextOfMid, asc);

        return mergeByName(left, right, asc);
    }

    private ItemNode mergeByName(ItemNode a, ItemNode b, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        int cmp = a.itemName.compareToIgnoreCase(b.itemName);
        if ((asc && cmp <= 0) || (!asc && cmp > 0)) {
            a.next = mergeByName(a.next, b, asc);
            return a;
        } else {
            b.next = mergeByName(a, b.next, asc);
            return b;
        }
    }

    private ItemNode mergeSortByPrice(ItemNode h, boolean asc) {
        if (h == null || h.next == null)
            return h;

        ItemNode mid = getMiddle(h);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSortByPrice(h, asc);
        ItemNode right = mergeSortByPrice(nextOfMid, asc);

        return mergeByPrice(left, right, asc);
    }

    private ItemNode mergeByPrice(ItemNode a, ItemNode b, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        if ((asc && a.price <= b.price) || (!asc && a.price > b.price)) {
            a.next = mergeByPrice(a.next, b, asc);
            return a;
        } else {
            b.next = mergeByPrice(a, b.next, asc);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode h) {
        ItemNode slow = h, fast = h.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private void displaySingle(ItemNode i) {
        System.out.println("ID: " + i.itemId +
                ", Name: " + i.itemName +
                ", Quantity: " + i.quantity +
                ", Price: " + i.price);
    }
}
