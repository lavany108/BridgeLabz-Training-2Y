package core_java.Constructors.Problems;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        Vehicle v2 = new Vehicle("Alice", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        System.out.println("\nRegistration fee updated!\n");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
