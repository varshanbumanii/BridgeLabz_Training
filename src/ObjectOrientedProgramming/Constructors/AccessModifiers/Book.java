package ObjectOrientedProgramming.Constructors.AccessModifiers;

class Book {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook eb = new EBook();
        eb.ISBN = "978-12345";
        eb.title = "Java Programming";
        eb.setAuthor("James Gosling");

        eb.displayDetails();
    }
}

