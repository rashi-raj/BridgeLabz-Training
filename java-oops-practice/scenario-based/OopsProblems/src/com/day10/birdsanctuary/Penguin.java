package com.day10.birdsanctuary;

public class Penguin extends Bird implements Swimmable {

    Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println("Penguin swims underwater.");
    }
}
