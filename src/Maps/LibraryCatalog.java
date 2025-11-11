package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LibraryCatalog {
    private static Map<String, String> catalog = new HashMap<>();
    public static void main(String[] args) {
        addBook("978-0134685991", "Effective Java");
        addBook("978-0321356680", "Design Patterns");
        addBook("978-1250301697", "The Midnight Library");
        addBook("978-1449372171", "Head First Java");
        System.out.println("Current Catalog Size: " + catalog.size());
        searchByIsbn("978-0321356680");
        searchByIsbn("999-0000000000");
        removeBook("978-0134685991");
        searchByIsbn("978-0134685991");
        System.out.println("Current Catalog Size: " + catalog.size());
        printSortedCatalog();
        searchByTitle("The Midnight Library");
        searchByTitle("The Lord of the Rings");
    }
    public static void addBook(String isbn, String title) {
        catalog.put(isbn, title);
    }
    public static void removeBook(String isbn) {
        if (catalog.remove(isbn) != null) {
            System.out.println("Removed ISBN " + isbn);
        } else {
            System.out.println("Cannot remove: ISBN " + isbn + " not found.");
        }
    }
    public static void searchByIsbn(String isbn) {
        if (catalog.containsKey(isbn)) {
            String title = catalog.get(isbn);
            System.out.println("Found! ISBN " + isbn + " -> **" + title + "**");
        } else {
            System.out.println(" Book not found for ISBN: " + isbn);
        }
    }
    public static void printSortedCatalog() {
        Map<String, String> sortedCatalog = new TreeMap<>(catalog);
        for (Map.Entry<String, String> entry : sortedCatalog.entrySet()) {
            System.out.println("  ISBN: " + entry.getKey() + " | Title: " + entry.getValue());
        }
    }
    public static void searchByTitle(String targetTitle) {
        System.out.println("Searching for title: \"" + targetTitle + "\"...");
        String foundIsbn = null;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            String currentTitle = entry.getValue();
            if (currentTitle.equals(targetTitle)) {
                foundIsbn = entry.getKey();
                break;
            }
        }
        if (foundIsbn != null) {
            System.out.println("Found! Title: " + targetTitle + " is linked to ISBN: " + foundIsbn);
        } else {
            System.out.println("Title not found in the catalog: \"" + targetTitle + "\"");
        }
    }
}