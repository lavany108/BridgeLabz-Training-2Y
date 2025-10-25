package FunctionalInterfaces;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        double threshold = 37.5;
        double currentTemp = 38.2;
        Predicate<Double> isHighTemp = temp -> temp > threshold;
        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! High temperature detected: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature normal: " + currentTemp + "°C");
        }
    }
}
