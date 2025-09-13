package core_java.Constructors.Level1;

class Book {
        String title;
        String author;
        double price;
        Book() {
            title = "Unknown";
            author = "Unknown";
            price = 0.0;
        }
        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
        public static void main(String[] args) {
            Book b1 = new Book();
            Book b2 = new Book("Java Basics", "John Doe", 499.99);
            b1.displayDetails();
            b2.displayDetails();
        }
}