import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests = new ArrayList<>();
    ConferenceRoom Hall;
    ConferenceRoom Hall2;
    ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
    Bedroom bedroom1;
    Bedroom bedroom2;
    ArrayList<Bedroom> bedrooms  = new ArrayList<>();
    ArrayList<Booking> bookedRooms  = new ArrayList<>();
    HashMap<String, DiningRoom> diningRooms  = new HashMap<>();

    @Before
    public void before(){
    guest1 = new Guest("Bob");
    guest2 = new Guest("Rob");
    guests.add(guest1);
    guests.add(guest2);
    Hall = new ConferenceRoom( 2, guests, "Main Hall" );
    Hall2 = new ConferenceRoom( 4, guests, "Dance Hall" );
    conferenceRooms.add(Hall);
    conferenceRooms.add(Hall2);
    bedroom1 = new Bedroom(2, guests, 201, RoomType.SINGLE, 45 );
    bedroom2 = new Bedroom(4, guests, 202, RoomType.FAMILY, 70);
    bedrooms.add(bedroom1);
    bedrooms.add(bedroom2);
    hotel = new Hotel(bedrooms, conferenceRooms, bookedRooms, diningRooms);
    }

    @Test

    public void testCheckIn(){
        hotel.checkIn(guest1, bedroom1);
        assertEquals(3, bedroom1.getGuests().size());
    }

    @Test
    public void testCheckOut(){
        hotel.checkOut(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuests().size());
    }

    @Test
    public void testCanAddBooking(){
        hotel.bookRoom(bedroom1,2);
        assertEquals(1, bookedRooms.size());
    }

    @Test
    public void testNightlyRate(){
        Booking booking1 = hotel.bookRoom(bedroom1,2);
        assertEquals(90, bedroom1.returnTotalBill(booking1));

    }

}