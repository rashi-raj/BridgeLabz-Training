package com.day2.traincompanion;

public class CompartmentNavigation{
	Compartment current;
	int size;
	
	// Add compartments to train
	void addCompartment(String value){
		Compartment newCompartment = new Compartment(value); 
		if(current!=null) {
			current.next = newCompartment;
			newCompartment.previous = current;
		}
		current = newCompartment;
		size++;
		System.out.println("\nCompartment added successfully!\n");
	}
	
	// Remove compartments
	void removeCompartment(int val) {

	    if (current == null) {
	        System.out.println("Train is empty - No compartment to remove");
	        return;
	    }

	    if (val < 1 || val > size) {
	        System.out.println("Invalid compartment number");
	        return;
	    }

	    Compartment temp = current;

	    for (int i = size; i > val; i--) {
	        temp = temp.previous;
	    }

	    if (size == 1) {
	        current = null;
	    }
	    else if (temp == current) {
	        current = current.previous;
	        current.next = null;
	    }
	    
	    else if (temp.previous == null) {
	        temp.next.previous = null;
	    }
	    
	    else {
	        temp.previous.next = temp.next;
	        temp.next.previous = temp.previous;
	    }

	    size--;
	    System.out.println("Compartment removed successfully!");
	}

	// Display compartments
	void displayCompartment() {
		if(current==null) {
			System.out.println("Train is empty - No compartments available");
			return;
		}
		Compartment temp = current;
		while (temp != null) {
		    System.out.print(temp.services);
		    if (temp.next != null) System.out.print(" -> ");
		    temp = temp.previous;
		}
		System.out.println();

	}
	
	// Move forward with the compartment
	void moveForward() {
		if(current==null || current.next==null) {
			System.out.println("No forward compartment");
			return;
		}
		current = current.next;
		System.out.println("Moved Forward : it has " + current.services + " services");
	}
	
	// Move backward with the compartment
	void moveBackward() {
		if(current==null || current.previous==null) {
			System.out.println("No backward compartment");
			return;
		}
		current = current.previous;
		System.out.println("Moved Backward : it has " + current.services + " services");
	}
	
	// Display adjacent compartments
	void displayAdjacent() {
	    if (current == null) {
	        System.out.println("No compartments available");
	        return;
	    }
	    if (current.previous == null && current.next == null) {
	        System.out.println("Only one compartment: " + current.services);
	    }
	    else if (current.previous == null) {
	        System.out.println("No previous compartment -> Current has " + current.services + " -> Next has " + current.next.services);
	    }
	    else if (current.next == null) {
	        System.out.println("Previous has " + current.previous.services +" -> Current has " + current.services +" -> No next compartment");
	    }
	    else {
	        System.out.println("Previous has " + current.previous.services + " -> Current has " + current.services + " -> Next has " + current.next.services);
	    }
	}

}
