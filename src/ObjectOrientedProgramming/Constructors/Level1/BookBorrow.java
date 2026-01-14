package ObjectOrientedProgramming.Constructors.Level1;

class BookBorrow {

    String title;
    String author;
    double price;
    boolean available;

    BookBorrow(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        BookBorrow b = new BookBorrow("Java", "James", 400);
        b.borrowBook();
        b.borrowBook();
    }
}

