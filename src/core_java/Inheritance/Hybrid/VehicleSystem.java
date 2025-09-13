package core_java.Inheritance.Hybrid;

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}
interface Refuelable {
    void refuel(); // abstract method
}
class ElectricVehicle extends Vehicle {
    int batteryCapacity;
    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }
    void charge() {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery.");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;
    PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelTankCapacity + " liters of petrol.");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic", 50);
        ev.displayInfo();
        ev.charge();
        pv.displayInfo();
        pv.refuel();
    }
}
