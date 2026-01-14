package ObjectOrientedProgramming.this_static_finalkeywords;

public class Product {
    static double discount = 10.0;
    String productName;
    int quantity;
    double price;
    final int productID;
    public Product(String productName, int quantity, double price, int productID) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.productID=productID;
    }
    static void updateDiscount(double newdiscount) {
        discount = newdiscount;
    }
    void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            double totalPrice = p.price * p.quantity;
            double discountedPrice = totalPrice - (totalPrice * discount / 100);

            System.out.println("Product ID   : " + p.productID);
            System.out.println("Product Name : " + p.productName);
            System.out.println("Price        : " + p.price);
            System.out.println("Quantity     : " + p.quantity);
            System.out.println("Discount (%) : " + discount);
            System.out.println("Final Price  : " + discountedPrice);
        } else {
            System.out.println("Invalid Product Object");
        }}
        public static void main(String[] args) {

            Product p1 = new Product("Laptop", 60000, 1, 201);
            Product p2 = new Product("Mouse", 500, 2, 202);

            p1.displayProductDetails(p1);
            p2.displayProductDetails(p2);

            Product.updateDiscount(15);

            System.out.println("\nAfter Discount Update:\n");
            p1.displayProductDetails(p1);
        }
    }

