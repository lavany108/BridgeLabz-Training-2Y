package core_java.Constructors.Level1;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    void displayBooking() {
        System.out.println("Guest-" + guestName);
        System.out.println("Room Type-" + roomType);
        System.out.println("Nights-" + nights);
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);
        b1.displayBooking();
        b2.displayBooking();
        b3.displayBooking();
    }
}
