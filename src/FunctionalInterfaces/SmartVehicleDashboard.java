package FunctionalInterfaces;

interface VehicleDashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: Not applicable for non-electric vehicles.");
    }
}
class CarDashboard implements VehicleDashboard {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}
class ElectricCarDashboard implements VehicleDashboard {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }
    @Override
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}
public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard car = new CarDashboard();
        car.displaySpeed();
        car.displayBattery();
        VehicleDashboard eCar = new ElectricCarDashboard();
        eCar.displaySpeed();
        eCar.displayBattery();
    }
}
