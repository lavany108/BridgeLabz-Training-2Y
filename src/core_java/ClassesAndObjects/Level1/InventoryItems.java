package core_java.ClassesAndObjects.Level1;

public class InventoryItems {
    int itemCode;
    String itemName;
    double price;
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        InventoryItems item = new InventoryItems();
        item.itemCode = 101;
        item.itemName = "Pen";
        item.price = 10.5;
        item.displayDetails();
        int quantity = 5;
        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
    }
}