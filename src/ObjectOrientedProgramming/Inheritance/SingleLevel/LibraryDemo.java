package objectorientedprogramming.Inheritance.SingleLevel;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title       : " + title);
        System.out.println("Publication Year : " + publicationYear);
        System.out.println("Author Name      : " + authorName);
        System.out.println("Author Bio       : " + bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {

        Author bookAuthor = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java and API design"
        );

        bookAuthor.displayInfo();
    }
}

