package com.inheritance.assistedproblems.animalhierarchy;

public class Animal {
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Animal make sound");
	}
}
