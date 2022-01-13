import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {


    private ArrayList<Bedroom>bedrooms = new ArrayList<>();
    private ArrayList<ConferenceRoom>conferenceRooms = new ArrayList<>();
    private ArrayList<Booking>bookedRooms = new ArrayList<>();
    private HashMap<String, DiningRoom>diningRooms = new HashMap<>();

    public Hotel(ArrayList<Bedroom>bedrooms, ArrayList<ConferenceRoom>conferenceRooms,
                 ArrayList<Booking>bookedRooms, HashMap<String, DiningRoom>diningRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.bookedRooms = bookedRooms;
        this.diningRooms = diningRooms;
        diningRooms.put("Room 1", null);
        diningRooms.put("Room 2", null);
        diningRooms.put("Room 3", null);
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void  checkIn(Guest guest, AbstractRoom room){
        room.addSingleGuest(guest);
    }

    public void  checkOut(Guest guest, AbstractRoom room){
        room.removeSingleGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nightsBooked){
        Booking newBooking = new Booking(bedroom);
        newBooking.setNightsBooked(nightsBooked);
        bookedRooms.add(newBooking);
        return newBooking;
    }

//    public DiningRoom addDiningRoom(String diningRoomName, ArrayList<Guest> guests){
//        DiningRoom newDiningRoom = new DiningRoom(diningRoomName, guests);
//
//
//    }

}
