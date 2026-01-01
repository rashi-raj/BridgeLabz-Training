package com.inheritance.assistedproblems.animalhierarchy;

public class Cat extends Animal{
	
	Cat(String name, int age){
		super(name, age);
	}
	
	void makeSound() {
		System.out.println("Cats make meoww sound !");
	}
}
