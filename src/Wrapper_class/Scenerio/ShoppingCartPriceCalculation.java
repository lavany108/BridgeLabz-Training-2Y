package Wrapper_class.Scenerio;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartPriceCalculation {
    public static void main(String[] args) {
        List<String> stringPrices = Arrays.asList("250", "499", "99", "abc", "1250", "Free", "25.99");
        int totalPrice = 0;
        for (String priceStr : stringPrices) {
            System.out.print("Processing price: \"" + priceStr + "\" -> ");
            try {
                int itemPrice = Integer.parseInt(priceStr);
                totalPrice += itemPrice;
                System.out.println("Added " + itemPrice + " to total.");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid numeric format!!");
            }
        }
        System.out.println("Total Price= " + totalPrice);
    }
}

