package LambdaExpression;

import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " - ₹" + price + " - Rating: " + rating + " - Discount: " + discount + "%";
    }
}
public class CustomEcommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", 25000, 4.5, 10),
                new Product("Laptop", 60000, 4.2, 15),
                new Product("Headphones", 2000, 4.8, 5)
        );
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}
