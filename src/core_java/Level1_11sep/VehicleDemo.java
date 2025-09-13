package core_java.Level1_11sep;

class Vehicle {
    static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: " + registrationFee);
    }
    public void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid object! Not a Vehicle.");
        }
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP32AB1234", "Ravi Kumar", "Car");
        Vehicle v2 = new Vehicle("DL01XY7890", "Neha Sharma", "Bike");
        v1.displayDetails(v1);
        v2.displayDetails(v2);
        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails(v1);
        v2.displayDetails("Not a Vehicle");
    }
}
