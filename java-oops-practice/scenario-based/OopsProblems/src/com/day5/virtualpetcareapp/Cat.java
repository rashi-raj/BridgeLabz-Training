package com.day5.virtualpetcareapp;


public class Cat extends Pet {

    public Cat(String name) {
        super(name, "Cat");
    }

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
