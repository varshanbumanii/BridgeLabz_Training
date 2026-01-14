package DataStructures.LinkedList.Singular;

import java.util.Scanner;

class StudentNode {
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    // Add at beginning
    void addAtBeginning(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning.");
    }

    // Add at end
    void addAtEnd(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Student added at end.");
    }

    // Add at position
    void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Student added at position " + pos);
    }

    // Delete by roll number
    void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == roll) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }

        StudentNode temp = head;

        while (temp.next != null && temp.next.rollNo != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted.");
        }
    }

    // Search by roll number
    void search(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Student Found:");
                displayNode(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade
    void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Display all records
    void display() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    void displayNode(StudentNode node) {
        System.out.println("----------------------");
        System.out.println("Roll No : " + node.rollNo);
        System.out.println("Name    : " + node.name);
        System.out.println("Age     : " + node.age);
        System.out.println("Grade   : " + node.grade);
    }
}

public class StudentLinkedListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        while (true) {
            System.out.println("\n1.Add Beginning\n2.Add End\n3.Add Position\n4.Delete\n5.Search\n6.Update Grade\n7.Display\n8.Exit");
            int choice = sc.nextInt();

            int roll, age, pos;
            String name, grade;

            switch (choice) {
                case 1:
                    System.out.print("Roll No: ");
                    roll = sc.nextInt();
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Age: ");
                    age = sc.nextInt();
                    System.out.print("Grade: ");
                    grade = sc.next();
                    list.addAtBeginning(roll, name, age, grade);
                    break;

                case 2:
                    System.out.print("Roll No: ");
                    roll = sc.nextInt();
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Age: ");
                    age = sc.nextInt();
                    System.out.print("Grade: ");
                    grade = sc.next();
                    list.addAtEnd(roll, name, age, grade);
                    break;

                case 3:
                    System.out.print("Position: ");
                    pos = sc.nextInt();
                    System.out.print("Roll No: ");
                    roll = sc.nextInt();
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Age: ");
                    age = sc.nextInt();
                    System.out.print("Grade: ");
                    grade = sc.next();
                    list.addAtPosition(pos, roll, name, age, grade);
                    break;

                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    roll = sc.nextInt();
                    list.deleteByRoll(roll);
                    break;

                case 5:
                    System.out.print("Enter Roll No to search: ");
                    roll = sc.nextInt();
                    list.search(roll);
                    break;

                case 6:
                    System.out.print("Enter Roll No: ");
                    roll = sc.nextInt();
                    System.out.print("New Grade: ");
                    grade = sc.next();
                    list.updateGrade(roll, grade);
                    break;

                case 7:
                    list.display();
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

