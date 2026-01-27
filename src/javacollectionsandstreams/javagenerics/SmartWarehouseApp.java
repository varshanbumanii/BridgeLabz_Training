package javacollectionsandstreams.javagenerics;

import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getCategory();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseApp {

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " - " + item.getCategory());
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));
        electronicsStorage.addItem(new Electronics("Headphones"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Oil"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Coffee Table"));
        furnitureStorage.addItem(new Furniture("Bar Stool"));

        System.out.println("Electronics Items:");
        displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Items:");
        displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Items:");
        displayItems(furnitureStorage.getItems());
    }
}

