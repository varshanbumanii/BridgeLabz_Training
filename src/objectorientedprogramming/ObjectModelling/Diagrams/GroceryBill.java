package objectorientedprogramming.objectmodelling.diagrams;

import java.util.ArrayList;

class Product {
    String name;
    double quantity;
    double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getCost() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    ArrayList<Product> products = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addProduct(Product product) {
        products.add(product);
    }
}

class BillGenerator {

    void generateBill(Customer customer) {
        double total = 0;

        System.out.println("Customer: " + customer.name);

        for (Product p : customer.products) {
            double cost = p.getCost();
            total += cost;
            System.out.println(p.name + " : Rs." + cost);
        }

        System.out.println("Total Bill: Rs." + total);
    }
}

public class GroceryBill {
    public static void main(String[] args) {

        Customer customer = new Customer("Alice");

        customer.addProduct(new Product("Apples", 2, 30));
        customer.addProduct(new Product("Milk", 1, 25));

        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);
    }
}

