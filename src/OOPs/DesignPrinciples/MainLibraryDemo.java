package OOPs.DesignPriciples;

// MainLibraryDemo.java
public class MainLibraryDemo {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Java Basics", "James Gosling");

        // Create libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Add books to different libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book can be in multiple libraries
        lib2.addBook(b3);

        // Display books
        lib1.showBooks();
        lib2.showBooks();
    }
}
