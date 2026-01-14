package ObjectOrientedProgramming.Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.ArrayList;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    abstract double calculateDiscount();
}

// -------- Electronics --------
class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "GST 18% applied";
    }
}

// -------- Clothing --------
class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "GST 12% applied";
    }
}

class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class ECommerce {

    static void printFinalPrice(Product product) {
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Product Name : " + product.getName());
        System.out.println("Base Price  : " + product.getPrice());
        System.out.println("Discount   : " + discount);
        System.out.println("Tax        : " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        for (Product p : products) {
            printFinalPrice(p);   // Polymorphism
        }
    }
}

