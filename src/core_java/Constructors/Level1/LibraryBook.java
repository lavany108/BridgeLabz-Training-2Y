package core_java.Constructors.Level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + "Successfully Borrowes!!");
        } else {
            System.out.println(title + " Already borrowed!!");
        }
    }
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("OOP in Java", "James Gosling", 599.0);
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();
    }
}
