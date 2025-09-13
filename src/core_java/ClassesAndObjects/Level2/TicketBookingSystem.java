package core_java.ClassesAndObjects.Level2;

public class TicketBookingSystem {
    String movieName;
    int seatNumber;
    double price;
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Booked Successfully!");
    }
    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        TicketBookingSystem ticket = new TicketBookingSystem();
        ticket.bookTicket("Avengers: Endgame", 12, 350);
        ticket.displayTicket();
    }
}