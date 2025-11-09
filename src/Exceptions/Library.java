package Exceptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Map<String, Boolean> bookAvailability = new HashMap<>();
    private Map<String, Set<String>> userBorrowedBooks = new HashMap<>();
    private static final int MAX_BOOKS_PER_USER = 5;
    public Library() {
        bookAvailability.put("The Great Gatsby", true);
        bookAvailability.put("1984", true);
        bookAvailability.put("Moby Dick", false);
        bookAvailability.put("The Hitchhiker's Guide", true);
    }
    public void borrowBook(String userID, String bookTitle)
            throws BookNotAvailableException, UserLimitExceededException {
        userBorrowedBooks.putIfAbsent(userID, new HashSet<>());
        if (userBorrowedBooks.get(userID).size() >= MAX_BOOKS_PER_USER) {
            throw new UserLimitExceededException(
                    String.format("User %s cannot borrow '%s'. Limit of %d books reached.",
                            userID, bookTitle, MAX_BOOKS_PER_USER)
            );
        }
        if (!bookAvailability.containsKey(bookTitle) || !bookAvailability.get(bookTitle)) {
            if (!bookAvailability.containsKey(bookTitle)) {
                System.out.println("LOG: Book not found in catalog: " + bookTitle);
                throw new BookNotAvailableException("Book '" + bookTitle + "' not found.");
            }
            throw new BookNotAvailableException(
                    "Book '" + bookTitle + "' is currently checked out by another user."
            );
        }
        bookAvailability.put(bookTitle, false);
        userBorrowedBooks.get(userID).add(bookTitle);
        System.out.println(userID + " successfully borrowed: " + bookTitle);
    }
    public void returnBook(String userID, String bookTitle) throws InvalidReturnException {
        if (!userBorrowedBooks.containsKey(userID) || !userBorrowedBooks.get(userID).contains(bookTitle)) {
            throw new InvalidReturnException(
                    String.format("User %s cannot return '%s'. This book was not borrowed by them.",
                            userID, bookTitle)
            );
        }
        bookAvailability.put(bookTitle, true);
        userBorrowedBooks.get(userID).remove(bookTitle);
        System.out.println(userID + " successfully returned: " + bookTitle);
    }
    public static void main(String[] args) {
        Library library = new Library();
        String userA = "U101";
        String userB = "U102";
        try {
            library.borrowBook(userA, "Moby Dick");
        } catch (BookNotAvailableException e) {
            System.err.println(e.getMessage());
            System.out.println("Action: Suggest reserving the book or choosing an alternative.");
        } catch (Exception e) { System.err.println("Unexpected Error: " + e.getMessage()); }
        try {
            library.borrowBook(userA, "The Great Gatsby");
            library.borrowBook(userA, "1984");
        } catch (Exception e) { System.err.println("Unexpected Error: " + e.getMessage()); }
        library.bookAvailability.put("Book3", true);
        library.bookAvailability.put("Book4", true);
        library.bookAvailability.put("Book5", true);
        try {
            library.borrowBook(userA, "Book3");
            library.borrowBook(userA, "Book4");
            library.borrowBook(userA, "Book5");
            library.borrowBook(userA, "The Hitchhiker's Guide");
        } catch (UserLimitExceededException e) {
            System.err.println(e.getMessage());
            System.out.println("Action: Ask user to return some books first.");
        } catch (Exception e) { System.err.println("Unexpected Error: " + e.getMessage()); }
        try {
            library.returnBook(userB, "The Great Gatsby");
        } catch (InvalidReturnException e) {
            System.err.println(e.getMessage());
            System.out.println("Action: Investigate who actually borrowed the book or if the title is wrong.");
        } catch (Exception e) { System.err.println(e.getMessage()); }
        try {
            library.returnBook(userA, "1984");
        } catch (Exception e) { System.err.println("Unexpected Error: " + e.getMessage()); }
        System.out.println("Books currently borrowed by " + userA + ": " + library.userBorrowedBooks.get(userA).size());
        System.out.println("Is '1984' available after return? " + library.bookAvailability.get("1984"));

    }
}