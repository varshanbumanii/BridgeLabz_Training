package DataStructures.LinkedList.Circular;
import java.util.Scanner;

// -------- Ticket Node --------
class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int id, String customer, String movie, String seat, String time) {
        this.ticketId = id;
        this.customerName = customer;
        this.movieName = movie;
        this.seatNumber = seat;
        this.bookingTime = time;
        this.next = null;
    }
}

// -------- Circular Linked List --------
class TicketCircularList {
    TicketNode head = null;
    TicketNode tail = null;

    // Add ticket at end
    void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode node = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        System.out.println("Ticket booked successfully.");
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                }
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                else if (curr == tail) {
                    prev.next = head;
                    tail = prev;
                }
                else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket removed successfully.");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket not found.");
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = head;
        do {
            displayNode(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket
    void search(String key) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                    temp.movieName.equalsIgnoreCase(key)) {
                displayNode(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found.");
    }

    // Count tickets
    int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    void displayNode(TicketNode node) {
        System.out.println("----------------------------");
        System.out.println("Ticket ID     : " + node.ticketId);
        System.out.println("Customer Name : " + node.customerName);
        System.out.println("Movie Name    : " + node.movieName);
        System.out.println("Seat Number   : " + node.seatNumber);
        System.out.println("Booking Time  : " + node.bookingTime);
    }
}

// -------- MAIN --------
public class TicketReservationCircularList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TicketCircularList tickets = new TicketCircularList();

        while (true) {
            System.out.println("\n1.Book Ticket\n2.Remove Ticket\n3.Display Tickets\n4.Search Ticket\n5.Count Tickets\n6.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            int id;
            String customer, movie, seat, time, key;

            switch (choice) {

                case 1:
                    System.out.print("Ticket ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer Name: ");
                    customer = sc.nextLine();
                    System.out.print("Movie Name: ");
                    movie = sc.nextLine();
                    System.out.print("Seat Number: ");
                    seat = sc.nextLine();
                    System.out.print("Booking Time: ");
                    time = sc.nextLine();
                    tickets.addTicket(id, customer, movie, seat, time);
                    break;

                case 2:
                    System.out.print("Enter Ticket ID to remove: ");
                    id = sc.nextInt();
                    tickets.removeTicket(id);
                    break;

                case 3:
                    tickets.displayTickets();
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Search by Customer or Movie: ");
                    key = sc.nextLine();
                    tickets.search(key);
                    break;

                case 5:
                    System.out.println("Total Tickets Booked: " + tickets.countTickets());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

