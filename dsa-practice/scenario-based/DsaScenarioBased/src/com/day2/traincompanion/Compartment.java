package com.day2.traincompanion;

public class Compartment {
	String services;
	Compartment next;
	Compartment previous;
	
	Compartment(String services){
		this.services = services;
		this.next = null;
		this.previous = null;
	}
}
