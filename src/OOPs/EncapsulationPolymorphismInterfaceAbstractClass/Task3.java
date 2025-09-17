package OOPs.EncapsulationPolymorphismInterfaceAbstractClass;

abstract class RentalVehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public RentalVehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void getVehicleDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate per day: " + rentalRate);
    }
}

// Car class
class RentalCar extends RentalVehicle {
    public RentalCar(String number, double rate) {
        super(number, "Car", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }
}

// Bike class
class RentalBike extends RentalVehicle {
    public RentalBike(String number, double rate) {
        super(number, "Bike", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 0.8; // bikes are cheaper
    }
}

// Truck class
class RentalTruck extends RentalVehicle {
    public RentalTruck(String number, double rate) {
        super(number, "Truck", rate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.5; // trucks cost more
    }
}

// Main program
public class Task3 {
    public static void main(String[] args) {
        RentalVehicle[] vehicles = {
                new RentalCar("C101", 1000),
                new RentalBike("B202", 500),
                new RentalTruck("T303", 2000)
        };

        int days = 5;

        for (RentalVehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Rental cost for " + days + " days: Rs." + v.calculateRentalCost(days));
            System.out.println();
        }
    }
}
