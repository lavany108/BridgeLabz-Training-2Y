package core_java.Constructors.Level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
    void displayDetails() {
        System.out.println("Customer name- " + customerName);
        System.out.println("Car Model-" + carModel);
        System.out.println("Rental Days- " + rentalDays);
        System.out.println("Total Cost- " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental = new CarRental("David", "Toyota Innova", 5);
        rental.displayDetails();
    }
}
