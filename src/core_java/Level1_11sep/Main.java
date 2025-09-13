package core_java.Level1_11sep;

class Book {
    static String libraryName = "Central City Library";
    private String title;
    private String author;
    private final String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        } else {
            System.out.println("Not a valid Book object.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN12345");
        Book b2 = new Book("Python 101", "Guido van Rossum", "ISBN67890");
        b1.displayDetails(b1);
        System.out.println();
        b2.displayDetails(b2);
        String notBook = "Hello";
        b1.displayDetails(notBook);
    }
}
