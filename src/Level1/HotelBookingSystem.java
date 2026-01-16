package Level1;

public class HotelBookingSystem {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBookingSystem() {
        this("Unknown Guest", "Standard", 1);
    }

    public HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBookingSystem(HotelBookingSystem other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy null booking");
        }
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBookingSystem hbs = new HotelBookingSystem("Alex", "Suite", 4);


    }
}
