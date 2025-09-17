package OOPs.EncapsulationPolymorphismInterfaceAbstractClass;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println(itemName + " x" + quantity + " Price: " + price);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }

    @Override
    public String getDiscountDetails() { return "5% off on Veg Items"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override
    public double calculateTotalPrice() { return (getPrice() * getQuantity()) + 50; } // extra charges

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.1; }

    @Override
    public String getDiscountDetails() { return "10% off on Non-Veg Items"; }
}

public class Task6 {
    public static void main(String[] args) {
        FoodItem[] order = {
                new VegItem("Paneer", 200, 2),
                new NonVegItem("Chicken", 300, 1)
        };

        for (FoodItem f : order) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            double discount = ((Discountable)f).applyDiscount();
            System.out.println("Final Price: " + (total - discount));
        }
    }
}
