package javacollectionsandstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }
}

public class OnlineMarketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 25000, new GadgetCategory());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(phone, 5);

        for (Product<?> product : catalog) {
            System.out.println(
                    product.getName() + "     |     " +
                            product.getCategory().getCategoryName() + "     |     ₹" +
                            product.getPrice()
            );
        }
    }
}

