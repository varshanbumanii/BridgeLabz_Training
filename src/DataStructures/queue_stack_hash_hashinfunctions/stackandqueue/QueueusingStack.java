package DataStructures.queue_stack_hash_hashinfunctions.stackandqueue;

import java.util.Stack;
import java.util.Scanner;

class QueueUsingStacks {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println(data + " inserted into queue.");
    }

    // Dequeue operation
    public void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        int removed = stack2.pop();
        System.out.println("Removed: " + removed);
    }

    // Display Queue
    public void display() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");

        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }
}

public class QueueusingStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        while (true) {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

