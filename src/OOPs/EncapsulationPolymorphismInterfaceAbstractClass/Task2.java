package OOPs.EncapsulationPolymorphismInterfaceAbstractClass;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.1; } // 10%

    @Override
    public double calculateTax() { return getPrice() * 0.18; } // 18%

    @Override
    public String getTaxDetails() { return "GST: 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.2; } // 20%

    @Override
    public double calculateTax() { return getPrice() * 0.05; } // 5%

    @Override
    public String getTaxDetails() { return "GST: 5%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; } // 5%
}

public class Task2 {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(201, "Laptop", 60000),
                new Clothing(202, "T-Shirt", 1000),
                new Groceries(203, "Rice", 500)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
