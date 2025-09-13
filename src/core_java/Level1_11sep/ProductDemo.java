package core_java.Level1_11sep;

class Product {
    static double discount = 10.0;
    private static int productCount = 0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    Product(String productName, double price, int quantity) {
        this.productID = ++productCount;  // Auto-generate unique ID
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }
    public double getTotalPrice() {
        double total = price * quantity;
        double discountedTotal = total - (total * discount / 100);
        return discountedTotal;
    }
    public void displayDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: " + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: " + p.getTotalPrice());
        } else {
            System.out.println("Invalid object! Not a Product.");
        }
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1);
        Product p2 = new Product("Phone", 20000, 2);
        p1.displayDetails(p1);
        p2.displayDetails(p2);
        Product.updateDiscount(20);
        p1.displayDetails(p1);
        p2.displayDetails("Not a product object");
    }
}
