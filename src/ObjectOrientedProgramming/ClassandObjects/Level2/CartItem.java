package ObjectOrientedProgramming.ClassandObjects.Level2;

import java.util.Scanner;

public class CartItem {

        String itemName;
        double price;
        int quantity;

        void addItem(String name, double itemPrice, int qty) {
            itemName = name;
            price = itemPrice;
            quantity = qty;
        }

        void removeItem() {
            quantity = 0;
            System.out.println("Item removed from cart");
        }

        void displayTotalCost() {
            double totalCost = price * quantity;
            System.out.println("Total Cost: " + totalCost);
        }

        public static void main(String[] args) {
            CartItem item = new CartItem();
            Scanner sc = new Scanner(System.in);
            item.addItem(sc.nextLine(), sc.nextDouble(), sc.nextInt());
            item.displayTotalCost();

            item.removeItem();
            item.displayTotalCost();
        }
}
