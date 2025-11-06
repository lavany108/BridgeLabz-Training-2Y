package Wrapper_class.Scenerio;

import java.util.ArrayList;
import java.util.List;

public class SensorDataLogger {
    private static final List<Double> storage = new ArrayList<>();

    public static void logTemperature(double temperature) {
        storage.add(temperature);
    }
    public static double getLastReading() {
        if (storage.isEmpty()) {
            return Double.NaN;
        }
        double lastReading = storage.get(storage.size() - 1);
        return lastReading;
    }
    public static void main(String[] args) {
        double sensorReading1 = 20.5; // Input 1: Primitive double
        logTemperature(sensorReading1);
        Double sensorReading2 = 22.1; // Input 2: Wrapper Double
        logTemperature(sensorReading2);
        System.out.println("List<Double>: " + storage);
        double latestTemp = getLastReading();
        System.out.println("Latest Primitive Temperature= " + latestTemp);
    }
}
