package core_java.Inheritance.Single;

class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Author authorBook = new Author(
                "The Java Journey",
                2023,
                "John Doe",
                "John Doe is a software engineer and author specializing in Java programming."
        );
        authorBook.displayInfo();
    }
}
