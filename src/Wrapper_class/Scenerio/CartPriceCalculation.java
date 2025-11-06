package Wrapper_class.Scenerio;

import java.util.ArrayList;
import java.util.List;

public class CartPriceCalculation  {

    public static void main(String[] args) {
        List<String> itemPrices = new ArrayList<>();
        itemPrices.add("250");
        itemPrices.add("499");
        itemPrices.add("abc");
        itemPrices.add("99");
        itemPrices.add("125");
        itemPrices.add("opq");

        int totalPrice = 0;

        for (String priceString : itemPrices) {
            try {
                int price = Integer.parseInt(priceString);
                totalPrice += price;
            } catch (NumberFormatException e) {
                System.out.println("Error!! Invalid Price: " + priceString);
            }
        }
        System.out.println("Total price= " + totalPrice);
    }
}