package Exceptions;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VehicleTracker {
    private LocalDate lastServiceDate;
    private int currentMileage;
    public VehicleTracker(LocalDate lastServiceDate, int currentMileage) {
        this.lastServiceDate = lastServiceDate;
        this.currentMileage = currentMileage;
    }
    public void checkMaintenance(LocalDate today)
            throws InvalidMileageException, ServiceOverdueException {
        if (currentMileage < 0) {
            throw new InvalidMileageException(
                    "Maintenance check failed! Invalid mileage= " + currentMileage + "."
            );
        }
        long daysSinceLastService = ChronoUnit.DAYS.between(lastServiceDate, today);
        if (daysSinceLastService > 365) {
            throw new ServiceOverdueException(
                    "Maintenance check failed! Service is overdue by " +
                            (daysSinceLastService - 365) + " days."
            );
        }
        System.out.println("Maintenance Status is OK. Days since service= " + daysSinceLastService);
    }
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        VehicleTracker vehicle1 = new VehicleTracker(today, -100);
        try {
            vehicle1.checkMaintenance(today);
        } catch (InvalidMileageException e) {
            System.err.println(e.getMessage());
            System.out.println("Please correct the mileage record!");
        } catch (ServiceOverdueException e) {
            System.err.println( e.getMessage());
        }
        LocalDate overdueDate = today.minusYears(2); // 730+ days ago
        VehicleTracker vehicle2 = new VehicleTracker(overdueDate, 50000);
        try {
            vehicle2.checkMaintenance(today);
        } catch (InvalidMileageException e) {
            System.err.println( e.getMessage());
        } catch (ServiceOverdueException e) {
            System.err.println(e.getMessage());
            System.out.println("A service appointment immediately!");
        }
        LocalDate validDate = today.minusMonths(3); // About 90 days ago
        VehicleTracker vehicle3 = new VehicleTracker(validDate, 15000);
        try {
            vehicle3.checkMaintenance(today);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}