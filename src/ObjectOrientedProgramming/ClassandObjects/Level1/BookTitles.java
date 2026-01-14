package ObjectOrientedProgramming.ClassandObjects.Level1;

import java.util.Scanner;

public class BookTitles {
    String title;
    String author;
    double price;
    int quantity;
    void display(){
        System.out.println("The title is: " + title);
        System.out.println("The author is: " + author);
        System.out.println("The price is: " + price);
        System.out.println("The quantity is: " + quantity);
        System.out.println("Total Amount: "+(price*quantity));
    }
    public static  void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        BookTitles book = new BookTitles();
        book.title = sc.nextLine();
        book.author = sc.nextLine();
        book.price = sc.nextDouble();
        book.quantity = sc.nextInt();
        book.display();
    }
}
