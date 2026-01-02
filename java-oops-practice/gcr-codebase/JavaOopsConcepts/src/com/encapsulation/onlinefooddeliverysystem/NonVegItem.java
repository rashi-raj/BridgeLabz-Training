package com.encapsulation.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50.0;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = (getPrice() * getQuantity()) + EXTRA_CHARGE;
        return basePrice - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%, Extra Charge: ₹50";
    }
}
