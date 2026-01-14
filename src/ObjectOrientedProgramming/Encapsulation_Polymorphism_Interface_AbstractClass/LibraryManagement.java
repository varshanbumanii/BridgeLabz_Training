package ObjectOrientedProgramming.Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.ArrayList;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    // Encapsulated borrower data
    private String borrowerName;
    private boolean isAvailable = true;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (encapsulation)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrower(String name) {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

// -------- Book --------
class Book extends LibraryItem implements Reservable {

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

// -------- DVD --------
class DVD extends LibraryItem implements Reservable {

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrower(borrowerName);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Effective Java", "Joshua Bloch"));
        items.add(new Magazine(102, "National Geographic", "NatGeo"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            System.out.println("---- Library Item ----");
            item.getItemDetails();

            Reservable r = (Reservable) item;
            if (r.checkAvailability()) {
                r.reserveItem("Varsha");
            }

            System.out.println();
        }
    }
}

