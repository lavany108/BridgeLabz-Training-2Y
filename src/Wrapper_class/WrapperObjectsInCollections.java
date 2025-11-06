package Wrapper_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapperObjectsInCollections {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        System.out.println("Original Primitive Prices Array=");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        List<Double> priceList = new ArrayList<>();
        for (double price : prices) {
            priceList.add(price);
        }
        System.out.println("Converted ArrayList<Double>=");
        System.out.println(priceList);
        if (!priceList.isEmpty()) {
            double highestPrice = Collections.max(priceList);
            System.out.printf("Highest Price= $%.2f%n", highestPrice);
        } else {
            System.out.println("The price list is empty!!");
        }
        if (!priceList.isEmpty()) {
            double sum = 0;
            for (Double price : priceList) {
                sum += price;
            }
            double averagePrice = sum / priceList.size();
            System.out.printf("Average Price= $%.2f%n", averagePrice);
        }
    }
}

