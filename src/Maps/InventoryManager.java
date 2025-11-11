package Maps;
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private static Map<String, Integer> inventory = new HashMap<>();
    public static void main(String[] args) {
        addProduct("Laptop", 10);
        addProduct("Mouse", 50);
        addProduct("Keyboard", 25);
        System.out.println("Current Inventory: " + inventory);
        sellProduct("Laptop", 2);
        sellProduct("Mouse", 55);
        sellProduct("Keyboard", 20);
        sellProduct("Headphones", 5);
        System.out.println("Inventory after sales: " + inventory);
        restockProduct("Laptop", 5);
        restockProduct("Mouse", 10);
        System.out.println("Inventory after restock: " + inventory);
        queryStock("Laptop");
        queryStock("Mouse");
        queryStock("Keyboard");
        queryStock("Charger");
        printOutOfStockItems();
    }
    public static void addProduct(String name, int quantity) {
        inventory.put(name, quantity);
    }
    public static void sellProduct(String name, int soldQuantity) {
        if (!inventory.containsKey(name)) {
            System.out.println("Product '" + name + "' is not stocked.");
            return;
        }
        int currentQuantity = inventory.get(name);
        int newQuantity = currentQuantity - soldQuantity;
        if (newQuantity <= 0) {
            inventory.remove(name);
            System.out.println("Sold " + soldQuantity + " units of " + name + ".Item is now out of stock");
        } else {
            inventory.put(name, newQuantity);
            System.out.println("Sold " + soldQuantity + " units of " + name + ". Remaining units: " + newQuantity);
        }
    }
    public static void restockProduct(String name, int shipmentQuantity) {
        int currentQuantity = inventory.getOrDefault(name, 0);
        int newQuantity = currentQuantity + shipmentQuantity;
        inventory.put(name, newQuantity);
        System.out.println("Restocked " + shipmentQuantity + " units of " + name + ".Total units: " + newQuantity);
    }
    public static void queryStock(String name) {
        if (inventory.containsKey(name)) {
            int quantity = inventory.get(name);
            System.out.println( name + " stock: " + quantity + " units.");
        } else {
            System.out.println( name + " stock: Zero (Not Stocked)");
        }
    }
    public static void printOutOfStockItems() {
        System.out.println("Products Still in Stock");
        if (inventory.isEmpty()) {
            System.out.println("No products currently in stock.");
        } else {
            for (String product : inventory.keySet()) {
                System.out.println(product);
            }
        }
    }
}
