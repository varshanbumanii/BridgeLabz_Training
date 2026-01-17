package datastructures.linkedlist.singular;

import java.util.Scanner;

class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    ItemNode head;

    // ---------------- ADD OPERATIONS ----------------

    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
        System.out.println("Item added at beginning.");
    }

    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
        System.out.println("Item added at end.");
    }

    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;

        System.out.println("Item added at position " + pos);
    }

    // ---------------- REMOVE ----------------

    void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    // ---------------- UPDATE ----------------

    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // ---------------- SEARCH ----------------

    void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayNode(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayNode(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found.");
    }

    // ---------------- TOTAL VALUE ----------------

    void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    // ---------------- SORTING ----------------

    void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
        System.out.println("Inventory sorted by name.");
    }

    void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
        System.out.println("Inventory sorted by price.");
    }

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null)
            return node;

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(node, asc, byName);
        ItemNode right = mergeSort(nextOfMiddle, asc, byName);

        return sortedMerge(left, right, asc, byName);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;

        if (byName)
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        if (condition) {
            a.next = sortedMerge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, asc, byName);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null)
            return head;

        ItemNode slow = head;
        ItemNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // ---------------- DISPLAY ----------------

    void display() {
        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    void displayNode(ItemNode node) {
        System.out.println("------------------------");
        System.out.println("ID       : " + node.itemId);
        System.out.println("Name     : " + node.itemName);
        System.out.println("Quantity : " + node.quantity);
        System.out.println("Price    : " + node.price);
    }
}

// ---------------- MAIN ----------------

public class InventoryLinkedListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();

        while (true) {
            System.out.println("\n1.Add Beginning\n2.Add End\n3.Add Position\n4.Remove\n5.Update Quantity\n6.Search by ID\n7.Search by Name\n8.Total Value\n9.Sort Name Asc\n10.Sort Name Desc\n11.Sort Price Asc\n12.Sort Price Desc\n13.Display\n14.Exit");

            int choice = sc.nextInt();
            int id, qty, pos;
            double price;
            String name;

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Quantity: ");
                    qty = sc.nextInt();
                    System.out.print("Price: ");
                    price = sc.nextDouble();
                    inventory.addAtBeginning(id, name, qty, price);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Quantity: ");
                    qty = sc.nextInt();
                    System.out.print("Price: ");
                    price = sc.nextDouble();
                    inventory.addAtEnd(id, name, qty, price);
                    break;

                case 3:
                    System.out.print("Position: ");
                    pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Quantity: ");
                    qty = sc.nextInt();
                    System.out.print("Price: ");
                    price = sc.nextDouble();
                    inventory.addAtPosition(pos, id, name, qty, price);
                    break;

                case 4:
                    System.out.print("Enter ID to remove: ");
                    id = sc.nextInt();
                    inventory.removeById(id);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();
                    System.out.print("New Quantity: ");
                    qty = sc.nextInt();
                    inventory.updateQuantity(id, qty);
                    break;

                case 6:
                    System.out.print("Enter ID: ");
                    id = sc.nextInt();
                    inventory.searchById(id);
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    inventory.searchByName(name);
                    break;

                case 8:
                    inventory.calculateTotalValue();
                    break;

                case 9:
                    inventory.sortByName(true);
                    break;

                case 10:
                    inventory.sortByName(false);
                    break;

                case 11:
                    inventory.sortByPrice(true);
                    break;

                case 12:
                    inventory.sortByPrice(false);
                    break;

                case 13:
                    inventory.display();
                    break;

                case 14:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
