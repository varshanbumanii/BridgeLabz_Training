package datastructures.linkedlist.doubly;

import java.util.Scanner;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    MovieNode head;
    MovieNode tail;

    // Add at beginning
    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Movie added at beginning.");
    }

    // Add at end
    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Movie added at end.");
    }

    // Add at position
    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Movie added at position " + pos);
    }

    // Remove by movie title
    void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie removed successfully.");
    }

    // Search by director or rating
    void search(String director, double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                displayNode(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No matching movie found.");
        }
    }

    // Update rating by title
    void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Display forward
    void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayNode(temp);
            temp = temp.prev;
        }
    }

    void displayNode(MovieNode node) {
        System.out.println("---------------------------");
        System.out.println("Title    : " + node.title);
        System.out.println("Director : " + node.director);
        System.out.println("Year     : " + node.year);
        System.out.println("Rating   : " + node.rating);
    }
}

public class MovieDoublyLinkedListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        while (true) {
            System.out.println("\n1.Add Beginning\n2.Add End\n3.Add Position\n4.Remove\n5.Search\n6.Update Rating\n7.Display Forward\n8.Display Reverse\n9.Exit");
            int choice = sc.nextInt();

            String title, director;
            int year, pos;
            double rating;

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    title = sc.next();
                    System.out.print("Director: ");
                    director = sc.next();
                    System.out.print("Year: ");
                    year = sc.nextInt();
                    System.out.print("Rating: ");
                    rating = sc.nextDouble();
                    list.addAtBeginning(title, director, year, rating);
                    break;

                case 2:
                    System.out.print("Title: ");
                    title = sc.next();
                    System.out.print("Director: ");
                    director = sc.next();
                    System.out.print("Year: ");
                    year = sc.nextInt();
                    System.out.print("Rating: ");
                    rating = sc.nextDouble();
                    list.addAtEnd(title, director, year, rating);
                    break;

                case 3:
                    System.out.print("Position: ");
                    pos = sc.nextInt();
                    System.out.print("Title: ");
                    title = sc.next();
                    System.out.print("Director: ");
                    director = sc.next();
                    System.out.print("Year: ");
                    year = sc.nextInt();
                    System.out.print("Rating: ");
                    rating = sc.nextDouble();
                    list.addAtPosition(pos, title, director, year, rating);
                    break;

                case 4:
                    System.out.print("Enter title to remove: ");
                    title = sc.next();
                    list.removeByTitle(title);
                    break;

                case 5:
                    System.out.print("Search Director: ");
                    director = sc.next();
                    System.out.print("OR Rating: ");
                    rating = sc.nextDouble();
                    list.search(director, rating);
                    break;

                case 6:
                    System.out.print("Enter title: ");
                    title = sc.next();
                    System.out.print("New Rating: ");
                    rating = sc.nextDouble();
                    list.updateRating(title, rating);
                    break;

                case 7:
                    list.displayForward();
                    break;

                case 8:
                    list.displayReverse();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

