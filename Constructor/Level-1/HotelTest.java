class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
}

public class HotelTest {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking("Anita", "Deluxe", 3);
        HotelBooking h2 = new HotelBooking(h1);

        h1.display();
        h2.display();
    }
}
