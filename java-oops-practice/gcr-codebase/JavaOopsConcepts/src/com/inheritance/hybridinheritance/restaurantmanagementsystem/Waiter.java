package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Duties: Serving food and assisting customers");
    }
}