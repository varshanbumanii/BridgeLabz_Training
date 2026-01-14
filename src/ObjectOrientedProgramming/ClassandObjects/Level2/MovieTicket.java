package ObjectOrientedProgramming.ClassandObjects.Level2;

import java.util.Scanner;

public class MovieTicket {

        String movieName;
        int seatNumber;
        double price;

        void bookTicket(String movie, int seat, double ticketPrice) {
            movieName = movie;
            seatNumber = seat;
            price = ticketPrice;
        }

        void displayTicketDetails() {
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        }

        public static void main(String[] args) {

            MovieTicket ticket = new MovieTicket();
            Scanner sc = new Scanner(System.in);
            ticket.bookTicket(sc.nextLine(), sc.nextInt(), sc.nextInt());
            ticket.displayTicketDetails();
        }
}
