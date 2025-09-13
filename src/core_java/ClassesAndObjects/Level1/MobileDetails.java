package core_java.ClassesAndObjects.Level1;

public class MobileDetails {
    String brand;
    String model;
    double price;
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MobileDetails phone1 = new MobileDetails();
        phone1.brand = "Apple";
        phone1.model = "iPhone 15";
        phone1.price = 1200.99;
        MobileDetails phone2 = new MobileDetails();
        phone2.brand = "Samsung";
        phone2.model = "Galaxy S23";
        phone2.price = 999.99;
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();
        System.out.println();
        System.out.println("Phone 2 Details:");
        phone2.displayDetails();
    }
}