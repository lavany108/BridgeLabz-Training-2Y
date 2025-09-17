package OOPs.EncapsulationPolymorphismInterfaceAbstractClass;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println(itemId + ": " + title + " by " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem() { available = false; }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem() { available = false; }

    @Override
    public boolean checkAvailability() { return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(int id, String title, String author) { super(id, title, author); }

    @Override
    public int getLoanDuration() { return 3; }

    @Override
    public void reserveItem() { available = false; }

    @Override
    public boolean checkAvailability() { return available; }
}

public class Task5 {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book(1, "Java Basics", "James Gosling"),
                new Magazine(2, "Tech Weekly", "Editor X"),
                new DVD(3, "Matrix", "Wachowski")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
