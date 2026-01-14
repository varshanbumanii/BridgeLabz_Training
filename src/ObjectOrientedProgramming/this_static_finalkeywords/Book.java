package ObjectOrientedProgramming.this_static_finalkeywords;

public class Book {
    static String libraryName = "BridgeLabz Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title : " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN  : " + b.isbn);
        } else {
            System.out.println("Invalid Book Object");
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book book2 = new Book("Python Basics", "Guido", "ISBN002");

        Book.displayLibraryName();

        book1.displayBookDetails(book1);
        book2.displayBookDetails(book2);
    }
}
