package com.inheritance.assistedproblems.animalhierarchy;

public class Main {
	public static void main(String args[]) {
		Animal animal = new Animal("Animal",12);
		
		Animal cat = new Cat("Persian Cat",2);
		
		Animal dog = new Dog("German shepherd",5);
		
		Animal bird = new Bird("Crow",1);
		
		animal.makeSound();
		cat.makeSound();
		dog.makeSound();
		bird.makeSound();
	}
}
