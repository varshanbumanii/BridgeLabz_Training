package DataStructures.LinkedList.Circular;

import java.util.Scanner;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class CircularTaskList {
    TaskNode head = null;
    TaskNode current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }

        current = head;
        System.out.println("Task added at beginning.");
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        current = head;
        System.out.println("Task added at end.");
    }

    // Add at position
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;

        current = head;
        System.out.println("Task added at position " + pos);
    }

    // Remove by task ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }

                current = head;
                System.out.println("Task removed.");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found.");
    }

    // View current task and move next
    void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        displayNode(current);
        current = current.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        do {
            displayNode(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayNode(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }

    void displayNode(TaskNode node) {
        System.out.println("-----------------------");
        System.out.println("Task ID   : " + node.taskId);
        System.out.println("Task Name : " + node.taskName);
        System.out.println("Priority  : " + node.priority);
        System.out.println("Due Date  : " + node.dueDate);
    }
}

public class CircularTaskScheduler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularTaskList list = new CircularTaskList();

        while (true) {
            System.out.println("\n1.Add Beginning\n2.Add End\n3.Add Position\n4.Remove Task\n5.View Next Task\n6.Display All\n7.Search by Priority\n8.Exit");
            int choice = sc.nextInt();

            int id, priority, pos;
            String name, dueDate;

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Task ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    name = sc.nextLine();
                    System.out.print("Priority: ");
                    priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    dueDate = sc.nextLine();
                    list.addAtBeginning(id, name, priority, dueDate);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Task ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    name = sc.nextLine();
                    System.out.print("Priority: ");
                    priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    dueDate = sc.nextLine();
                    list.addAtEnd(id, name, priority, dueDate);
                    break;

                case 3:
                    System.out.print("Position: ");
                    pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    name = sc.nextLine();
                    System.out.print("Priority: ");
                    priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    dueDate = sc.nextLine();
                    list.addAtPosition(pos, id, name, priority, dueDate);
                    break;

                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    id = sc.nextInt();
                    list.removeById(id);
                    break;

                case 5:
                    list.viewNextTask();
                    break;

                case 6:
                    list.displayAll();
                    break;

                case 7:
                    System.out.print("Enter Priority: ");
                    priority = sc.nextInt();
                    list.searchByPriority(priority);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
