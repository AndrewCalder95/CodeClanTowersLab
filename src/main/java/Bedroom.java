import java.util.ArrayList;

public class Bedroom extends AbstractRoom {

    private int roomNumber;
    private int nightlyRate;
    private RoomType roomType;
    private ArrayList<Guest> guests;


    public Bedroom(int capacity, ArrayList<Guest> guests, int roomNumber, RoomType roomType, int nightlyRate) {
        super(capacity, guests);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guests = guests;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public void addSingleGuest(Guest guest){
        guests.add(guest);
    }

    @Override
    public void removeSingleGuest(Guest guest) {
        guests.remove(guest);
    }

    public int returnTotalBill(Booking booking){
        return nightlyRate * booking.getNightsBooked();
    }


}
