package com.day8.restaurantorderingsystem;

import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println(" Welcome to FoodLoop App ");

        String ans;
        do {
        	System.out.println("1. Vegetarian Menu");
            System.out.println("2. Non-Vegetarian Menu");
            System.out.println("3. Combo Meal");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
        	switch(choice){

            case 1 -> {
                FoodItem veg1 = new VegItem("Paneer Tikka", 550, 5);
                FoodItem veg2 = new VegItem("Veg Biryani", 450, 3);
                FoodItem veg3 = new VegItem("Kadhai Mushroom", 499, 4);
                veg1.displayDetails();
                veg2.displayDetails();
                veg3.displayDetails();
                System.out.println("\n\nSelect 1,2,3 :");
                int foodChoice = sc.nextInt();
                switch(foodChoice){
                	case 1 -> {
                		order.addFoodItem(veg1);
                	}
                	
                	case 2 -> {
                		order.addFoodItem(veg2);
                	}
                	
                	case 3 -> {
                		order.addFoodItem(veg3);
                	}	
                }
            }

            case 2 -> {
                FoodItem nonVeg1 = new NonVegItem("Chicken Tikka", 650, 4);
                FoodItem nonVeg2 = new NonVegItem("Mutton Biryani", 850, 2);
                FoodItem nonVeg3 = new NonVegItem("Fish Curry", 699, 2);
                nonVeg1.displayDetails();
                nonVeg2.displayDetails();
                nonVeg3.displayDetails();
                System.out.println("\n\nSelect 1,2,3 :");
                int foodChoice = sc.nextInt();
                switch(foodChoice){
                	case 1 -> {
                		order.addFoodItem(nonVeg1);
                	}
                	
                	case 2 -> {
                		order.addFoodItem(nonVeg2);
                	}
                	
                	case 3 -> {
                		order.addFoodItem(nonVeg3);
                	}
                	
                }
            }

            case 3 -> {
                FoodItem veg = new VegItem("Aloo Paratha", 300, 5);
                FoodItem nonVeg = new NonVegItem("Chicken Curry", 700, 4);

                ComboOrder.applyCombo(order, veg, nonVeg);
            }


            case 0 -> System.out.println("Thank you for using FoodLoop!");

            default -> System.out.println("Invalid choice!");
            
           
        }
        	 System.out.println("Do you want to continuing order? (yes/no) : ");
             ans = sc.next();
        }while(ans.equalsIgnoreCase("yes"));
        
        System.out.println("\nDo you want to place order?(yes/no)");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("yes")) {
        	order.placeOrder();
        }else {
        	System.out.println("\nOops, No placed orders!!!!");
        }
        
        sc.close();
    }
}
