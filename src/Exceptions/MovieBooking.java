package Exceptions;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MovieBooking {
    private Map<String, Boolean> seatStatus = new HashMap<>();
    public MovieBooking() {
        String[] seats = {"A1", "A2", "A3", "B1", "B2", "C5"};
        for (String seat : seats) {
            seatStatus.put(seat, false);
        }
        seatStatus.put("B2", true);
    }
    public void bookSeat(String seatNumber)
            throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seatStatus.containsKey(seatNumber)) {
            throw new InvalidSeatException(
                    "Booking failed: Seat " + seatNumber + " does not exist in this theater layout."
            );
        }
        if (seatStatus.get(seatNumber)) {
            throw new SeatAlreadyBookedException(
                    "Booking failed: Seat " + seatNumber + " is already taken. Please choose another seat."
            );
        }
        seatStatus.put(seatNumber, true);
        System.out.println("Seat " + seatNumber + " has been booked for you!");
    }
    public Set<String> getAvailableSeats() {
        Set<String> available = new java.util.HashSet<>();
        for (Map.Entry<String, Boolean> entry : seatStatus.entrySet()) {
            if (!entry.getValue()) {
                available.add(entry.getKey());
            }
        }
        return available;
    }
    public static void main(String[] args) {
        MovieBooking app = new MovieBooking();
        System.out.println("Available Seats: " + app.getAvailableSeats());
        try {
            app.bookSeat("A1");
        } catch (Exception e) { System.err.println( e.getMessage()); }
        try {
            app.bookSeat("Z9");
        } catch (InvalidSeatException e) {
            System.err.println(e.getMessage());
            System.out.println("Please enter a valid seat number.");
        } catch (Exception e) { System.err.println( e.getMessage()); }
        try {
            app.bookSeat("B2");
        } catch (SeatAlreadyBookedException e) {
            System.err.println(e.getMessage());
            System.out.println("Check the seating chart for available options.");
        } catch (Exception e) { System.err.println(e.getMessage()); }
        try {
            app.bookSeat("A1");
        } catch (SeatAlreadyBookedException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) { System.err.println( e.getMessage()); }
        System.out.println("Remaining Available Seats: " + app.getAvailableSeats());
    }
}