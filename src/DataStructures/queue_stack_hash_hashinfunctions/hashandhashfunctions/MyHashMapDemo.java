package DataStructures.Stack_Queue_HashMap_HashingFunctions.HashandHashingFunctions;

import java.util.Scanner;

// Node class
class Node {
    int key;
    String value;
    Node next;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

// Custom HashMap class
class MyHashMap {

    private int capacity = 10;
    private Node[] table;

    MyHashMap() {
        table = new Node[capacity];
    }

    // Hash function
    private int hash(int key) {
        return key % capacity;
    }

    // Insert or Update
    public void put(int key, String value) {
        int index = hash(key);
        Node head = table[index];

        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                System.out.println("Updated key: " + key);
                return;
            }
            temp = temp.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        table[index] = newNode;
        System.out.println("Inserted key: " + key);
    }

    // Retrieve value
    public String get(int key) {
        int index = hash(key);
        Node temp = table[index];

        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return null;
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        Node temp = table[index];
        Node prev = null;

        while (temp != null) {
            if (temp.key == key) {

                if (prev == null)
                    table[index] = temp.next;
                else
                    prev.next = temp.next;

                System.out.println("Key removed: " + key);
                return;
            }
            prev = temp;
            temp = temp.next;
        }

        System.out.println("Key not found.");
    }

    // Display HashMap
    public void display() {
        System.out.println("\nHashMap Contents:");
        for (int i = 0; i < capacity; i++) {
            System.out.print("Bucket " + i + ": ");
            Node temp = table[i];

            if (temp == null) {
                System.out.println("Empty");
                continue;
            }

            while (temp != null) {
                System.out.print("[" + temp.key + " = " + temp.value + "] -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}

// Main class
public class MyHashMapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyHashMap map = new MyHashMap();

        while (true) {
            System.out.println("\n1.Put\n2.Get\n3.Remove\n4.Display\n5.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int key;
            String value;

            switch (choice) {

                case 1:
                    System.out.print("Enter key (int): ");
                    key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter value: ");
                    value = sc.nextLine();
                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to get: ");
                    key = sc.nextInt();
                    String result = map.get(key);
                    if (result != null)
                        System.out.println("Value: " + result);
                    else
                        System.out.println("Key not found.");
                    break;

                case 3:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextInt();
                    map.remove(key);
                    break;

                case 4:
                    map.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
