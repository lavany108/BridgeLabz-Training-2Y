package Exceptions;
import java.util.Scanner;

public class TemperatureConverter {
    private static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;
    public double convert(double value, char unit) throws InvalidTemperatureException {
        double convertedValue;
        if (unit == 'C') {
            if (value < ABSOLUTE_ZERO_CELSIUS) {
                throw new InvalidTemperatureException(
                        "Temperature " + value + "°C is below absolute zero (" + ABSOLUTE_ZERO_CELSIUS + "°C)."
                );
            }
            convertedValue = (value * 9.0 / 5.0) + 32.0;
            System.out.println("Result: " + String.format("%.2f", value) + "°C is " + String.format("%.2f", convertedValue) + "°F");
        } else if (unit == 'F') {
            if (value < ABSOLUTE_ZERO_FAHRENHEIT) {
                throw new InvalidTemperatureException(
                        "Temperature " + value + "°F is below absolute zero (" + ABSOLUTE_ZERO_FAHRENHEIT + "°F)."
                );
            }
            convertedValue = (value - 32.0) * 5.0 / 9.0;
            System.out.println("Result: " + String.format("%.2f", value) + "°F is " + String.format("%.2f", convertedValue) + "°C");
        } else {
            System.err.println("Error: Invalid unit. Use 'C' or 'F'.");
            return Double.NaN;
        }
        return convertedValue;
    }
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);
        runTest(converter, 25.0, 'C', "Test 1: Valid Celsius");
        runTest(converter, -300.0, 'C', "Test 2: Invalid Celsius (Error expected)");
        runTest(converter, 32.0, 'F', "Test 3: Valid Fahrenheit");
        runTest(converter, -500.0, 'F', "Test 4: Invalid Fahrenheit (Error expected)");
        scanner.close();
    }
    private static void runTest(TemperatureConverter converter, double value, char unit, String testName) {
        System.out.println(testName + " | Input: " + value + "°" + unit);
        try {
            converter.convert(value, unit);
        } catch (InvalidTemperatureException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}