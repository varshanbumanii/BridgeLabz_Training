package objectorientedprogramming.ObjectModelling.SelfProblems;

import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order with " + o.products.size() + " products");
    }

    public static void main(String[] args) {
        Customer c = new Customer("Alice");
        Order o = new Order();
        o.products.add(new Product("Laptop", 60000));

        c.placeOrder(o);
    }
}

