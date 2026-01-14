package DataStructures.LinkedList.Doubly;

import java.util.Scanner;

class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;
    BookNode next;
    BookNode prev;

    BookNode(int id, String title, String author, String genre, boolean available) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class LibraryDoublyLinkedList {
    BookNode head;
    BookNode tail;

    // ---------------- ADD OPERATIONS ----------------

    void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        System.out.println("Book added at beginning.");
    }

    void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode node = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        System.out.println("Book added at end.");
    }

    void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
        if (pos == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode node = new BookNode(id, title, author, genre, available);

        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        System.out.println("Book added at position " + pos);
    }

    // ---------------- REMOVE ----------------

    void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
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

        System.out.println("Book removed successfully.");
    }

    // ---------------- SEARCH ----------------

    void search(String keyword) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) ||
                    temp.author.equalsIgnoreCase(keyword)) {
                displayNode(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found.");
    }

    // ---------------- UPDATE ----------------

    void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // ---------------- DISPLAY ----------------

    void displayForward() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayNode(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        if (tail == null) {
            System.out.println("No books available.");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayNode(temp);
            temp = temp.prev;
        }
    }

    // ---------------- COUNT ----------------

    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void displayNode(BookNode node) {
        System.out.println("------------------------");
        System.out.println("Book ID   : " + node.bookId);
        System.out.println("Title     : " + node.title);
        System.out.println("Author    : " + node.author);
        System.out.println("Genre     : " + node.genre);
        System.out.println("Available : " + (node.available ? "Yes" : "No"));
    }
}

// ---------------- MAIN ----------------

public class LibraryDoublyLinkedListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        while (true) {
            System.out.println("\n1.Add Beginning\n2.Add End\n3.Add Position\n4.Remove Book\n5.Search\n6.Update Availability\n7.Display Forward\n8.Display Reverse\n9.Count Books\n10.Exit");

            int choice = sc.nextInt();
            int id, pos;
            String title, author, genre, keyword;
            boolean status;

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    title = sc.nextLine();
                    System.out.print("Author: ");
                    author = sc.nextLine();
                    System.out.print("Genre: ");
                    genre = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    status = sc.nextBoolean();
                    library.addAtBeginning(id, title, author, genre, status);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    title = sc.nextLine();
                    System.out.print("Author: ");
                    author = sc.nextLine();
                    System.out.print("Genre: ");
                    genre = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    status = sc.nextBoolean();
                    library.addAtEnd(id, title, author, genre, status);
                    break;

                case 3:
                    System.out.print("Position: ");
                    pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    title = sc.nextLine();
                    System.out.print("Author: ");
                    author = sc.nextLine();
                    System.out.print("Genre: ");
                    genre = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    status = sc.nextBoolean();
                    library.addAtPosition(pos, id, title, author, genre, status);
                    break;

                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    id = sc.nextInt();
                    library.removeById(id);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Title or Author: ");
                    keyword = sc.nextLine();
                    library.search(keyword);
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    System.out.print("New Availability (true/false): ");
                    status = sc.nextBoolean();
                    library.updateAvailability(id, status);
                    break;

                case 7:
                    library.displayForward();
                    break;

                case 8:
                    library.displayReverse();
                    break;

                case 9:
                    System.out.println("Total Books: " + library.countBooks());
                    break;

                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

