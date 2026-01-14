package DataStructures.LinkedList.Doubly;

import java.util.Scanner;

class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}

class UndoRedoManager {

    private TextState head;
    private TextState current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state
    void addState(String newContent) {
        TextState newNode = new TextState(newContent);

        if (head == null) {
            head = current = newNode;
            size = 1;
            return;
        }

        // Remove forward history
        current.next = null;
        newNode.prev = current;
        current.next = newNode;
        current = newNode;
        size++;

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current state
    void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor empty.");
        }
    }
}

public class UndoRedoEditor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UndoRedoManager editor = new UndoRedoManager();

        while (true) {
            System.out.println("\n1.Type Text\n2.Undo\n3.Redo\n4.Display\n5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    editor.addState(text);
                    break;

                case 2:
                    editor.undo();
                    break;

                case 3:
                    editor.redo();
                    break;

                case 4:
                    editor.displayCurrent();
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
