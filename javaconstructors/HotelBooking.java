package javaconstructors;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        b1.displayBooking();
        HotelBooking b2 = new HotelBooking("Alice", "Deluxe", 3);
        b2.displayBooking();
        HotelBooking b3 = new HotelBooking(b2);
        b3.displayBooking();
    }
}

