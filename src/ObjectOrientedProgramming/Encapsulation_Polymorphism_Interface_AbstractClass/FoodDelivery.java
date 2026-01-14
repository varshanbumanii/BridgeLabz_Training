package ObjectOrientedProgramming.Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.ArrayList;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50;

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

public class FoodDelivery {

    static void processOrder(ArrayList<FoodItem> items) {
        double grandTotal = 0;

        for (FoodItem item : items) {
            System.out.println("---- Food Item ----");
            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                discount = ((Discountable) item).applyDiscount();
                System.out.println(((Discountable) item).getDiscountDetails());
            }

            double finalAmount = total - discount;
            grandTotal += finalAmount;

            System.out.println("Total Price : " + total);
            System.out.println("Discount    : " + discount);
            System.out.println("Final Price : " + finalAmount);
            System.out.println();
        }

        System.out.println("==== GRAND TOTAL ====");
        System.out.println("Amount Payable: " + grandTotal);
    }

    public static void main(String[] args) {

        ArrayList<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(order); // Polymorphism
    }
}

