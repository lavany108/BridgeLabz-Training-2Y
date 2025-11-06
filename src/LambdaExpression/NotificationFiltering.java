package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;
    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
    public String toString() {
        return "[" + type + "] " + message;
    }
}
public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("heart rate critical!", "Critical"),
                new Alert("appointment reminder", "Reminder"),
                new Alert("stock low of the medicine", "Inventory")
        );
        Predicate<Alert> criticalFilter = a -> a.type.equals("Critical");
        System.out.println("Filtered Alerts:");
        alerts.stream()
                .filter(criticalFilter)
                .forEach(System.out::println);
    }
}
