package com.inheritance.assistedproblems.animalhierarchy;

public class Bird extends Animal{
	
	Bird(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println("Birds make chirpp sound !");
	}
}
