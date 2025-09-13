package core_java.ClassesAndObjects.Level2;

public class ShoppingCart {
    String itemName;
    double price;
    int quantity;
    ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }
    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough quantity to remove!");
        }
    }
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String[] args) {
        ShoppingCart item = new ShoppingCart("Laptop", 50000, 1);
        item.displayTotalCost();
        item.addItem(1);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
