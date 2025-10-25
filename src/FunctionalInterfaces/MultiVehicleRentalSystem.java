package FunctionalInterfaces;

interface Vehicle {
    void rent();
    void returnVehicle();
}
class Car implements Vehicle {
    public void rent() {
        System.out.println("Car rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Car returned. Thank you!");
    }
}
class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bike returned. Thank you!");
    }
}
class Bus implements Vehicle {
    public void rent() {
        System.out.println("Bus rented successfully.");
    }
    public void returnVehicle() {
        System.out.println("Bus returned. Thank you!");
    }
}
public class MultiVehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}

