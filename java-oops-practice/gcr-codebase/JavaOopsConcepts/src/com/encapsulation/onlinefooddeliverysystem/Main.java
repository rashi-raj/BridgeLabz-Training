package com.encapsulation.onlinefooddeliverysystem;

public class Main {
    public static void main(String[] args) {

        FoodItem[] order = new FoodItem[2];
        order[0] = new VegItem("Paneer Butter Masala", 200, 2);
        order[1] = new NonVegItem("Chicken Biryani", 250, 1);

        for (FoodItem item : order) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }

            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
           
        }
    }
}
