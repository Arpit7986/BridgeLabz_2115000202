public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Arpit Jain";
        this.roomType = "Deluxe";
        this.nights = 2;
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

    public String getGuestName() {
        System.out.println("Guest Name is : " + guestName);
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        System.out.println("Room Type is : " + roomType);
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        System.out.println("Number of Nights is : " + nights);
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Ajay Jain", "Super Deluxe", 3);
        System.out.println("Guest Name: " + booking1.getGuestName());
        System.out.println("Room Type: " + booking1.getRoomType());
        System.out.println("Number of Nights: " + booking1.getNights());
    }
}